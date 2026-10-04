package com.jakucs.cardealershipapi.service;

import com.jakucs.cardealershipapi.dto.CarRequest;
import com.jakucs.cardealershipapi.model.Car;
import com.jakucs.cardealershipapi.model.Manufacturer;
import com.jakucs.cardealershipapi.repository.CarRepository;
import com.jakucs.cardealershipapi.repository.ManufacturerRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {
    private final CarRepository carRepository;
    private final ManufacturerService manufacturerService;
    private final ManufacturerRepository manufacturerRepository;

    public CarService(CarRepository carRepository, ManufacturerService manufacturerService, ManufacturerRepository manufacturerRepository){
        this.carRepository = carRepository;
        this.manufacturerService = manufacturerService;
        this.manufacturerRepository = manufacturerRepository;
    }

    public List<Car> getCars(){
        return carRepository.findAll();
    }

    public Car getCarById(Integer id){
        return carRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Car not found"));
    }

    public Car addCar(CarRequest request){
        Manufacturer manufacturer = manufacturerService.getManufacturerById(request.getManufacturerId());

        Car car = new Car();
        car.setVin(request.getVin());
        car.setManufacturer(manufacturer);
        car.setType(request.getType());
        car.setLicensePlate(request.getLicensePlate());
        car.setYear(request.getYear());
        car.setColor(request.getColor());
        car.setMileage(request.getMileage());
        car.setPrice(request.getPrice());
        car.setFuelType(request.getFuelType());
        car.setTransmissionType(request.getTransmissionType());
        car.setEnginePowerHp(request.getEnginePowerHp());
        car.setEngineDisplacementCc(request.getEngineDisplacementCc());
        car.setDoors(request.getDoors());
        car.setSeats(request.getSeats());
        car.setStatus(request.getStatus());

        return carRepository.save(car);
    }

    public Car modifyCarById(Integer id, CarRequest request){
        if(!carRepository.existsById(id)){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Car not found");
        }
        Car car = addCar(request);
        car.setId(id);
        return carRepository.save(car);
    }

    public void deleteCarById(Integer id){
        carRepository.deleteById(id);
    }
}

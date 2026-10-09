package com.jakucs.cardealershipapi.controller;

import com.jakucs.cardealershipapi.dto.CarRequest;
import com.jakucs.cardealershipapi.model.Car;
import com.jakucs.cardealershipapi.service.CarService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService){
        this.carService = carService;
    }

    @PostMapping
    public Car addCar(@Valid @RequestBody CarRequest request){
        return carService.addCar(request);
    }

    @GetMapping
    public List<Car> getCars(){
        return carService.getCars();
    }

    @GetMapping("/{id}")
    public Car getCarById(@PathVariable Integer id){
        return carService.getCarById(id);
    }

    @PutMapping("/{id}")
    public Car modifyCarById(@PathVariable Integer id, @Valid  @RequestBody CarRequest request){
        return carService.modifyCarById(id, request);
    }

    @DeleteMapping("/{id}")
    public void deleteCarById(@PathVariable Integer id){
        carService.deleteCarById(id);
    }
}

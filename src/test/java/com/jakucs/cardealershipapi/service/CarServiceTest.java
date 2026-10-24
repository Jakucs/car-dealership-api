package com.jakucs.cardealershipapi.service;

import com.jakucs.cardealershipapi.model.Car;
import com.jakucs.cardealershipapi.model.FuelType;
import com.jakucs.cardealershipapi.repository.CarRepository;
import com.jakucs.cardealershipapi.repository.ManufacturerRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CarServiceTest {

    @Mock
    private CarRepository carRepository;

    @InjectMocks
    private CarService carService;

    @Mock
    ManufacturerRepository manufacturerRepository;

    @Mock
    private ManufacturerService manufacturerService;


    










    @Test
    void getCars_shouldReturnCarsMatchingFilters(){
        Car car1 = new Car();
        Car car2 = new Car();

        List<Car> expectedCars = List.of(car1, car2);

        when(carRepository.search(FuelType.PETROL, 3_000_000, 2022))
                .thenReturn(expectedCars);

        List<Car> actualCars = carService.getCars(
                FuelType.PETROL, 3_000_000, 2022
        );

        assertEquals(expectedCars, actualCars);

    }


}

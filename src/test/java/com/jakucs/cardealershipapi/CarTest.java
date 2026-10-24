package com.jakucs.cardealershipapi;

import com.jakucs.cardealershipapi.model.Car;
import com.jakucs.cardealershipapi.model.Manufacturer;
import com.jakucs.cardealershipapi.model.Status;
import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CarTest {

    @Test
    void setVin_shouldStoreVin(){
        Car car = new Car();

        car.setVin("WVWZZZ1JZXW000001");

        assertEquals("WVWZZZ1JZXW000001", car.getVin());
    }

    @Test
    void setPrice_shouldStorePrice(){
        Car car = new Car();

        car.setPrice(5000);

        assertEquals(5000, car.getPrice());
    }

    @Test
    void manufacturerExist(){
        Manufacturer bmw = new Manufacturer();
        bmw.setName("BMW");
        Car car = new Car();
        car.setManufacturer(bmw);

        assertEquals("BMW", car.getManufacturer().getName());
    }

    @Test
    void newCar_shouldHaveDefaultValues() {
        Car car = new Car();

        assertEquals(0, car.getYear());
        assertEquals(Status.AVAILABLE, car.getStatus());
    }



}

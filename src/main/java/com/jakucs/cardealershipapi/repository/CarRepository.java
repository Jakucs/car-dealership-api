package com.jakucs.cardealershipapi.repository;

import com.jakucs.cardealershipapi.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Integer> {
}

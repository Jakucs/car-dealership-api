package com.jakucs.cardealershipapi.repository;

import com.jakucs.cardealershipapi.model.Car;
import com.jakucs.cardealershipapi.model.FuelType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Integer> {
    List<Car> findByFuelType(FuelType fuelType);
    List<Car> findByFuelTypeAndPriceGreaterThanEqual(FuelType fuelType, int minPrice);
    @Query("SELECT c FROM Car c WHERE " +
            "(:fuelType IS NULL OR c.fuelType = :fuelType) AND " +
            "(:minPrice IS NULL OR c.price >= :minPrice) AND " +
            "(:maxYear IS NULL OR c.year <= :maxYear)")
    List<Car> search(@Param("fuelType") FuelType fuelType,
                     @Param("minPrice") Integer minPrice,
                     @Param("maxYear") Integer maxYear);
}
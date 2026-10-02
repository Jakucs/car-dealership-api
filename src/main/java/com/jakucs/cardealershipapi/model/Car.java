package com.jakucs.cardealershipapi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Car {
    @Id
    @GeneratedValue
    private int id;


    @NotBlank
    @Column(unique = true, nullable = false, length = 17)
    private String vin;

    @NotBlank
    private String brand;
    @NotBlank
    private String type;

    private String licensePlate;

    private int year;
    @NotBlank
    private String color;
    @NotBlank
    private int mileage;
    private int price;
    @Enumerated(EnumType.STRING)
    private FuelType fuelType;
    @Enumerated(EnumType.STRING)
    private TransmissionType transmissionType;
    private int enginePowerHp;
    private int engineDisplacementCc;
    private int doors;
    private int seats;
    @Enumerated(EnumType.STRING)
    private Status status;
}

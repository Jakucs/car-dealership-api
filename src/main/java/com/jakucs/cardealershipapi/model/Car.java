package com.jakucs.cardealershipapi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Car {
    
    @Id
    @GeneratedValue
    private int id;


    @Column(unique = true, nullable = false, length = 17)
    private String vin;

    @ManyToOne(optional = false)
    @JoinColumn(name="manufacturer_id")
    private Manufacturer manufacturer;
    @NotBlank
    private String type;

    private String licensePlate;

    private int year;
    @NotBlank
    private String color;
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

    public int getId() {
        return id;
    }

    public String getVin() {
        return vin;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public String getType() {
        return type;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public int getMileage() {
        return mileage;
    }

    public int getPrice() {
        return price;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public TransmissionType getTransmissionType() {
        return transmissionType;
    }

    public int getEnginePowerHp() {
        return enginePowerHp;
    }

    public int getEngineDisplacementCc() {
        return engineDisplacementCc;
    }

    public int getDoors() {
        return doors;
    }

    public int getSeats() {
        return seats;
    }

    public Status getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public void setTransmissionType(TransmissionType transmissionType) {
        this.transmissionType = transmissionType;
    }

    public void setEnginePowerHp(int enginePowerHp) {
        this.enginePowerHp = enginePowerHp;
    }

    public void setEngineDisplacementCc(int engineDisplacementCc) {
        this.engineDisplacementCc = engineDisplacementCc;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}

package com.jakucs.cardealershipapi.dto;

import com.jakucs.cardealershipapi.model.FuelType;
import com.jakucs.cardealershipapi.model.Manufacturer;
import com.jakucs.cardealershipapi.model.Status;
import com.jakucs.cardealershipapi.model.TransmissionType;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

public class CarRequest {

    @NotBlank
    @Size(min=17, max=17)
    private String vin;

    @NotNull
    private Integer manufacturerId;
    @NotBlank
    private String type;

    private String licensePlate;

    @Min(1900)
    @Max(2100)
    private int year;
    @NotBlank
    private String color;
    @PositiveOrZero
    private int mileage;
    @Positive
    private int price;
    @NotNull
    private FuelType fuelType;
    @NotNull
    private TransmissionType transmissionType;
    @Positive
    private int enginePowerHp;
    @PositiveOrZero
    private int engineDisplacementCc;
    @Min(2)
    @Max(7)
    private int doors;
    @Min(1)
    @Max(9)
    private int seats;
    @NotNull
    private Status status;


    public String getVin() {
        return vin;
    }

    public Integer getManufacturerId() {
        return manufacturerId;
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

    public void setVin(String vin) {
        this.vin = vin;
    }

    public void setManufacturerId(Integer manufacturerId) {
        this.manufacturerId = manufacturerId;
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

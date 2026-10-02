package com.jakucs.cardealershipapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Manufacturer {

    @Id
    @GeneratedValue
    private int id;

    @NotBlank
    @Column(unique = true)
    private String name;

    @NotBlank
    private String country;

    private int foundedYear;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getFoundedYear() {
        return foundedYear;
    }

    public String getCountry() {
        return country;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFoundedYear(int foundedYear) {
        this.foundedYear = foundedYear;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setName(String name) {
        this.name = name;
    }

}
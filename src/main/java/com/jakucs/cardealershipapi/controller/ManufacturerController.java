package com.jakucs.cardealershipapi.controller;

import com.jakucs.cardealershipapi.model.Manufacturer;
import com.jakucs.cardealershipapi.repository.ManufacturerRepository;
import com.jakucs.cardealershipapi.service.ManufacturerService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/manufacturers")
public class ManufacturerController {

    private final ManufacturerService manufacturerService;

    public ManufacturerController(ManufacturerService manufacturerService){
        this.manufacturerService = manufacturerService;
    }

    @GetMapping
    public List<Manufacturer> getAll(){
        return manufacturerService.getAll();
    }

    @GetMapping("/{id}")
    public Manufacturer getManufacturerById(@PathVariable Integer id){
        return manufacturerService.getManufacturerById(id);
    }

    @PostMapping
    public Manufacturer addManufacturer(@Valid @RequestBody Manufacturer manufacturer){
        return manufacturerService.addManufacturer(manufacturer);
    }

    @PutMapping("/{id}")
    public Manufacturer modifyManufacturer(@PathVariable Integer id, @Valid @RequestBody Manufacturer manufacturer){
        return manufacturerService.modifyManufacturerById(id, manufacturer);
    }

    @DeleteMapping("/{id}")
    public void deleteManufacturer(@PathVariable Integer id){
        manufacturerService.deleteManufacturerById(id);
    }

}

package com.jakucs.cardealershipapi.controller;

import com.jakucs.cardealershipapi.model.Manufacturer;
import com.jakucs.cardealershipapi.repository.ManufacturerRepository;
import com.jakucs.cardealershipapi.service.ManufacturerService;
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
    public Manufacturer addManufacturer(@RequestBody Manufacturer manufacturer){
        return manufacturerService.newManufacturer(manufacturer);
    }

    @PutMapping("/{id}")
    public Manufacturer modifyManufacturer(@PathVariable Integer id, @RequestBody Manufacturer manufacturer){
        return manufacturerService.modifyManufacturerById(id, manufacturer);
    }

    @DeleteMapping("{id}")
    public void deleteManufacturer(@PathVariable Integer id){
        manufacturerService.deleteManufacturerById(id);
    }

}

package com.jakucs.cardealershipapi.service;

import com.jakucs.cardealershipapi.model.Manufacturer;
import com.jakucs.cardealershipapi.repository.ManufacturerRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

@Service
public class ManufacturerService {
    private final ManufacturerRepository manufacturerRepository;

        public ManufacturerService(ManufacturerRepository manufacturerRepository){
            this.manufacturerRepository = manufacturerRepository;
        }

        public List<Manufacturer> getAll(){
            return manufacturerRepository.findAll();
        }

        public Optional<Manufacturer> getManufacturerById(Integer id){
            return manufacturerRepository.findById(id);
        }

        public Manufacturer modifyManufacturerById(Integer id, Manufacturer manufacturer){
            manufacturerRepository.findById(id)
                    .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Manufacturer ot found"));

            manufacturer.setId(id);
            return manufacturerRepository.save(manufacturer);
        }

        public void deleteManufactureById(Integer id){
            manufacturerRepository.deleteById(id);
        }
}
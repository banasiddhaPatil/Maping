package com.geekster.MappingPractice.service;

import com.geekster.MappingPractice.model.Laptop;
import com.geekster.MappingPractice.repository.LaptopRepository;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class LaptopService {
    private final LaptopRepository laptopRepository;

    public LaptopService(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    public Laptop createLaptop(Laptop laptop) {
        return laptopRepository.save(laptop);
    }

    public Laptop getLaptopById(String id) {
        return laptopRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Laptop not found"));
    }

    public Laptop updateLaptop(String id, Laptop updatedLaptop) {
        Laptop existingLaptop = getLaptopById(id);
        existingLaptop.setName(updatedLaptop.getName());
        existingLaptop.setBrand(updatedLaptop.getBrand());
        existingLaptop.setPrice(updatedLaptop.getPrice());
        existingLaptop.setStudent(updatedLaptop.getStudent());
        return laptopRepository.save(existingLaptop);
    }

    public void deleteLaptop(String id) {
        laptopRepository.deleteById(id);
    }
}
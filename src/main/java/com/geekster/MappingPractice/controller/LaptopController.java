package com.geekster.MappingPractice.controller;

import com.geekster.MappingPractice.model.Laptop;
import com.geekster.MappingPractice.service.LaptopService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/laptops")
public class LaptopController {
    private final LaptopService laptopService;

    public LaptopController(LaptopService laptopService) {
        this.laptopService = laptopService;
    }

    @PostMapping
    public Laptop createLaptop(@RequestBody Laptop laptop) {
        return laptopService.createLaptop(laptop);
    }

    @GetMapping("/{id}")
    public Laptop getLaptop(@PathVariable String id) {
        return laptopService.getLaptopById(id);
    }

    @PutMapping("/{id}")
    public Laptop updateLaptop(@PathVariable String id, @RequestBody Laptop laptop) {
        return laptopService.updateLaptop(id, laptop);
    }

    @DeleteMapping("/{id}")
    public void deleteLaptop(@PathVariable String id) {
        laptopService.deleteLaptop(id);
    }
}
package com.geekster.MappingPractice.repository;

import com.geekster.MappingPractice.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, String> {
    // No additional methods needed as JpaRepository provides basic CRUD operations
}
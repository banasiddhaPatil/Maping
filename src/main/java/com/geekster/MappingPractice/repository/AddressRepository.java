package com.geekster.MappingPractice.repository;

import com.geekster.MappingPractice.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
    // No additional methods needed as JpaRepository provides basic CRUD operations
}
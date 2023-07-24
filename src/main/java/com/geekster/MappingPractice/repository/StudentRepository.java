package com.geekster.MappingPractice.repository;

import com.geekster.MappingPractice.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {
    // No additional methods needed as JpaRepository provides basic CRUD operations
}
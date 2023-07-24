package com.geekster.MappingPractice.repository;

import com.geekster.MappingPractice.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, String> {
    // No additional methods needed as JpaRepository provides basic CRUD operations
}
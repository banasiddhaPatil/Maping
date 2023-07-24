package com.geekster.MappingPractice.repository;

import com.geekster.MappingPractice.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, String> {
    // No additional methods needed as JpaRepository provides basic CRUD operations
}
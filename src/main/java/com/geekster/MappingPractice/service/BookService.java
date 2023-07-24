package com.geekster.MappingPractice.service;

import com.geekster.MappingPractice.model.Book;
import com.geekster.MappingPractice.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    public Book getBookById(String id) {
        return bookRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Book not found"));
    }

    public Book updateBook(String id, Book updatedBook) {
        Book existingBook = getBookById(id);
        existingBook.setTitle(updatedBook.getTitle());
        existingBook.setAuthor(updatedBook.getAuthor());
        existingBook.setDescription(updatedBook.getDescription());
        existingBook.setPrice(updatedBook.getPrice());
        existingBook.setStudent(updatedBook.getStudent());
        return bookRepository.save(existingBook);
    }

    public void deleteBook(String id) {
        bookRepository.deleteById(id);
    }
}
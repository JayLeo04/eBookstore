package com.jayleo.ebookstorebackend.service;

import com.jayleo.ebookstorebackend.entity.Book;
import com.jayleo.ebookstorebackend.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.time.LocalDateTime;

@Service
public class BookService {

    //Autowired注解可以自动装配Spring容器中的Bean，这里自动装配了BookRepository
    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(int id) {
        return bookRepository.findById(id).orElseThrow(()->new RuntimeException("Book not found"));
    }

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    public Book updateBook(int id, Book bookDetails) {
        Book book = bookRepository.findById(id).orElseThrow(()->new RuntimeException("Book not found"));
        book.setTitle(bookDetails.getTitle());
        book.setAuthor(bookDetails.getAuthor());
        book.setIsbn(bookDetails.getIsbn());
        book.setPrice(bookDetails.getPrice());
        book.setCover_url(bookDetails.getCover_url());
        book.setSales(bookDetails.getSales());
        book.setStock(bookDetails.getStock());
        book.setUpdatedAt(LocalDateTime.now());
        return bookRepository.save(book);
    }

    public void deleteBook(int id) {
        Book book = bookRepository.findById(id).orElseThrow(()->new RuntimeException("Book not found"));
        bookRepository.delete(book);
    }

}

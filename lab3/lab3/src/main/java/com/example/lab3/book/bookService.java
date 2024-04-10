package com.example.lab3.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import java.util.List;
 
@Service
public class bookService {
 
    private final BookRepository BookRepository;
 
    @Autowired
    public bookService(BookRepository bookRepository) {
        this.BookRepository = bookRepository;
    }
 
    public List<book> getAllBooks() {
        return BookRepository.findAll();
    }
 
    public book addBook(book book) {
        return BookRepository.save(book);
    }
 
    public book getBookById(Long id) {
        return BookRepository.findById(id).orElse(null);
    }
 
    public book updateBook(Long id, book updatedBook) {
        if (BookRepository.existsById(id)) {
            updatedBook.setId(id);
            return BookRepository.save(updatedBook);
        }
        return null;
    }
 
    public void deleteBook(Long id) {
        BookRepository.deleteById(id);
    }
}

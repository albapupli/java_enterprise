package com.example.lab3.book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")

public class bookController {
    private final BookRepository bookRepository;

    @Autowired
    public bookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping
    public List<book> getAllBooks() {
        return bookRepository.findAll();
    }

    @PostMapping
    public book addBook(@RequestBody book book) {
        return bookRepository.save(book);
    }

    @GetMapping("/{id}")
    public book getBookById(@PathVariable Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public book updateBook(@PathVariable Long id, @RequestBody book updatedBook) {
        if (bookRepository.existsById(id)) {
            updatedBook.setId(id);
            return bookRepository.save(updatedBook);
        }
        return null;

}
}
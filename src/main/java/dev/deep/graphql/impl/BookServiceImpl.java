package dev.deep.graphql.impl;

import dev.deep.graphql.entities.Book;
import dev.deep.graphql.repositories.BookRepository;
import dev.deep.graphql.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepo;

    @Override
    public Book create(Book book) {
        return this.bookRepo.save(book);
    }

    @Override
    public List<Book> getAll() {
        return this.bookRepo.findAll();
    }

    @Override
    public Book get(int bookId) {
        return this.bookRepo.findById(bookId)
                .orElseThrow(() -> new RuntimeException("Book you are looking for not found on server !!"));
    }

    @Override
    public Book update(Book book) {
        return this.bookRepo.saveAndFlush(book);
    }

    @Override
    public void delete(int bookId) {
        this.bookRepo.deleteById(bookId);
    }
}

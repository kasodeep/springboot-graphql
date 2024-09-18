package dev.deep.graphql.service;

import dev.deep.graphql.entities.Book;

import java.util.List;

public interface BookService {

    //Create
    Book create(Book book);

    //Get All
    List<Book> getAll();

    //Get Single Book
    Book get(int bookId);

    //Update Book
    Book update(Book book);

    //Delete Book
    void delete(int bookId);
}
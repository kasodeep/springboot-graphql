package dev.deep.graphql.service;

import dev.deep.graphql.entities.Author;

import java.util.List;

public interface AuthorService {

    //Create
    Author create(Author author);

    //Get All
    List<Author> getAll();

    //Get Single Author
    Author get(int authorId);

    //Update Author
    Author update(Author author);

    //Delete Author
    void delete(int authorId);
}

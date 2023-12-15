package dev.deep.graphql.repositories;

import dev.deep.graphql.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
    // Extra methods can be defined.
}

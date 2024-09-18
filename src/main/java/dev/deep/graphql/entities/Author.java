package dev.deep.graphql.entities;

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "authors")
public class Author {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    @OneToMany(mappedBy = "author")
    private List<Book> books;
}

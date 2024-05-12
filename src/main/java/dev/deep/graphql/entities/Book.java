package dev.deep.graphql.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue
    private Integer id;

    private String title;

    private String description;

    private double price;

    private Integer pages;

    @JoinColumn
    @ManyToOne(cascade = CascadeType.REMOVE)
    private Author author;
}

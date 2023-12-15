package dev.deep.graphql.util;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BookInput {

    private String title;

    private String description;

    private double price;

    private Integer pages;

    private Integer author;
}

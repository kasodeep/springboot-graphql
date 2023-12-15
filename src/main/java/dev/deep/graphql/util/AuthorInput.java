package dev.deep.graphql.util;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AuthorInput {

    private String name;
}

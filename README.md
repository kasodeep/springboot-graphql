# Spring Boot GraphQL App

This Spring Boot application provides a GraphQL API for managing authors and books.

## Schema

### Author Type
```graphql
type Author {
  id: ID!
  name: String
  books: [Book]
}
```

### How to make a request.
```graphql
mutation CreateAuthor($author: AuthorInput){
    createAuthor(author: $author) {
        # Data to be returned.
        name        
    }
}
```
```json
{
    "author": {
        "name":"Kumbhojkar"
    }
}
```


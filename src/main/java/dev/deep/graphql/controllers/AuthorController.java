package dev.deep.graphql.controllers;

import dev.deep.graphql.entities.Author;
import dev.deep.graphql.service.AuthorService;
import dev.deep.graphql.util.AuthorInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @MutationMapping("createAuthor")
    public Author create(@Argument AuthorInput author) {
        Author a = new Author();
        a.setName(author.getName());
        return this.authorService.create(a);
    }

    @MutationMapping("updateAuthor")
    public Author update(@Argument AuthorInput author, @Argument int authorId) {
        Author temp = this.authorService.get(authorId);
        temp.setName(author.getName());
        return this.authorService.update(temp);
    }

    @QueryMapping("allAuthors")
    public List<Author> getAll() {
        return this.authorService.getAll();
    }

    @QueryMapping("getAuthor")
    public Author get(@Argument int authorId) {
        return this.authorService.get(authorId);
    }

    @QueryMapping("deleteAuthor")
    public String delete(@Argument int authorId) {
        this.authorService.delete(authorId);
        return "Author successfully deleted with Id: " + authorId;
    }
}

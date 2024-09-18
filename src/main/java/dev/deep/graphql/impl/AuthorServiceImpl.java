package dev.deep.graphql.impl;

import dev.deep.graphql.entities.Author;
import dev.deep.graphql.repositories.AuthorRepository;
import dev.deep.graphql.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorRepository authorRepo;

    @Override
    public Author create(Author author) {
        return this.authorRepo.save(author);
    }

    @Override
    public List<Author> getAll() {
        return this.authorRepo.findAll();
    }

    @Override
    public Author get(int authorId) {
        return this.authorRepo.findById(authorId)
                .orElseThrow(() -> new RuntimeException("Author you are looking for not found on server !!"));
    }

    @Override
    public Author update(Author author) {
        return this.authorRepo.saveAndFlush(author);
    }

    @Override
    public void delete(int authorId) {
        this.authorRepo.deleteById(authorId);
    }
}

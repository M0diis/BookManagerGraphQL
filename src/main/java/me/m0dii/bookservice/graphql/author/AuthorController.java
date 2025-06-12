package me.m0dii.bookservice.graphql.author;


import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class AuthorController {
    private final AuthorService service;

    public AuthorController(AuthorService service) {
        this.service = service;
    }

    @QueryMapping
    public List<Author> allAuthors() {
        return service.getAllAuthors();
    }

    @QueryMapping
    public Author authorById(@Argument String id) {
        return service.getAuthorById(id);
    }

    @MutationMapping
    public Author addAuthor(@Argument AuthorInput author) {
        return service.addAuthor(author);
    }

    @MutationMapping
    public boolean deleteAuthor(@Argument String name) {
        return service.deleteAuthor(name);
    }
}
package me.m0dii.bookservice.graphql.author;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AuthorService {
    private final Map<String, Author> authors = new HashMap<>();

    public List<Author> getAllAuthors() {
        return new ArrayList<>(authors.values());
    }

    public Author getAuthorById(String id) {
        return authors.get(id);
    }

    public Author addAuthor(AuthorInput input) {
        String id = String.valueOf(UUID.randomUUID());
        String name = input.getName();
        Author author = new Author(id, name);
        authors.put(id, author);
        return author;
    }

    public boolean deleteAuthor(String name) {
        return authors.remove(name) != null;
    }
}
package me.m0dii.bookservice.graphql;


import org.springframework.graphql.data.method.annotation.*;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookController {
    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @QueryMapping
    public List<Book> allBooks() {
        return service.getAllBooks();
    }

    @QueryMapping
    public Book bookById(@Argument String id) {
        return service.getBookById(id);
    }

    @MutationMapping
    public Book addBook(@Argument String title, @Argument String author) {
        return service.addBook(title, author);
    }

    @MutationMapping
    public boolean deleteBook(@Argument String id) {
        return service.deleteBook(id);
    }
}
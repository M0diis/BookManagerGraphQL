package me.m0dii.bookservice.graphql.book;

import lombok.RequiredArgsConstructor;
import me.m0dii.bookservice.graphql.author.Author;
import me.m0dii.bookservice.graphql.author.AuthorService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class BookService {
    private final AuthorService authorService;

    private final Map<String, Book> books = new HashMap<>();

    public List<Book> getAllBooks() {
        return new ArrayList<>(books.values());
    }

    public Book getBookById(String id) {
        return books.get(id);
    }

    public Book addBook(BookInput input) {
        String id = UUID.randomUUID().toString();
        Author author = authorService.getAuthorById(input.getAuthorId());
        if (author == null) {
            throw new IllegalArgumentException("Author not found for id: " + input.getAuthorId());
        }
        Book book = new Book(id, input.getTitle(), author);
        books.put(id, book);
        return book;
    }

    public boolean deleteBook(String id) {
        return books.remove(id) != null;
    }
}
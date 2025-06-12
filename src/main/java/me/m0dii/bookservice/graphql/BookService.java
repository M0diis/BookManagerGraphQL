package me.m0dii.bookservice.graphql;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class BookService {
    private final Map<String, Book> books = new HashMap<>();

    public List<Book> getAllBooks() {
        return new ArrayList<>(books.values());
    }

    public Book getBookById(String id) {
        return books.get(id);
    }

    public Book addBook(String title, String author) {
        String id = UUID.randomUUID().toString();
        Book book = new Book(id, title, author);
        books.put(id, book);
        return book;
    }

    public boolean deleteBook(String id) {
        return books.remove(id) != null;
    }
}
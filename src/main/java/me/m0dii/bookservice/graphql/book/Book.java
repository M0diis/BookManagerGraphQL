package me.m0dii.bookservice.graphql.book;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import me.m0dii.bookservice.graphql.author.Author;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private String id;
    private String title;
    private Author author;
}
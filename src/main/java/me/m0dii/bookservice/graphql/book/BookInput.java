package me.m0dii.bookservice.graphql.book;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookInput {
    private String title;
    private String authorId;
}
package me.m0dii.bookservice.graphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookServicePublisher {
    public static void main(String[] args) {
        SpringApplication.run(BookServicePublisher.class, args);
        System.out.println("GraphQL service running at http://localhost:8080/graphql");
    }
}

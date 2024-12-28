package com.chein.task8;

import com.chein.task8.entity.BookEntity;
import com.chein.task8.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@RequiredArgsConstructor
public class Runner implements CommandLineRunner {

    private final BookService bookService;


    @Override
    public void run(String[] args) {
        BookEntity newBook = bookService.addNewBook("Сказки", "Старые");
        System.out.println("Добавлена новая книга с ID: " + newBook.getBook_id());

        bookService.updateBook(UUID.fromString("8eaaa877-5af8-428e-9f2c-423cb3498792"), "Рассказы", "Реальные");
        System.out.println("обновили книгу");

        bookService.delCarById(UUID.fromString("350f8402-ce8c-486f-a06b-74e029c19036"));
        System.out.println("Удалили книгу");
    }
}
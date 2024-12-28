package com.chein.task8.service;

import com.chein.task8.entity.BookEntity;
import com.chein.task8.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;



    @Transactional
    public BookEntity updateBook(UUID book_id, String book_type, String description){
        Optional<BookEntity> bookOpt = bookRepository.findById(book_id);

        BookEntity car = bookOpt.orElse(null);

        car.setBook_type(book_type);
        car.setDescription(description);

        return bookRepository.save(car);
    }


    @Transactional
    public BookEntity addNewBook(String book_type, String description){
        BookEntity book = new BookEntity();
        book.setBook_id(UUID.randomUUID());
        book.setBook_type(book_type);
        book.setDescription(description);

        return bookRepository.save(book);
    }

    @Transactional
    public void delCarById(UUID car_id){

        bookRepository.deleteById(car_id);
    }

}

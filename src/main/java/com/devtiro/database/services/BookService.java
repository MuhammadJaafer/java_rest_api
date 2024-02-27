package com.devtiro.database.services;

import com.devtiro.database.domain.entities.BookEntity;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface BookService {


    BookEntity createUpdateBook(String isbn, BookEntity book);

    List<BookEntity> findAll();

    Page<BookEntity> findAll(Pageable pageable);

    BookEntity findByIsbn(String isbn);

    boolean isExist(String isbn);

    BookEntity partialUpdate(String isbn, BookEntity bookEntity);

    void delete(String isbn);
}

package com.someapp.repository;

import com.someapp.model.Book;
import java.util.List;

public interface BookRepository {

    List<Book> getBooks();
}

package com.someapp.repository;

import com.someapp.model.Book;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository("bookRepository")
public class BookRepositoryImpl implements BookRepository {

    public List<Book> getBooks() {
        List<Book> bookList = new ArrayList<Book>();
        Book first = new Book("First", "FirstAuthor", 10);
        Book second = new Book("Second", "SecondAuthor", 15);
        bookList.add(first);
        bookList.add(second);
        return bookList;
    }
}

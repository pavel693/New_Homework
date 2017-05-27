package com.someapp.service;

import com.someapp.model.Book;
import com.someapp.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("libraryService")
public class LibraryServiceImpl implements LibraryService {

    @Autowired
    BookRepository bookRepository;

    public List<Book> getAvailableBooks() {
        return bookRepository.getBooks();
    }
}

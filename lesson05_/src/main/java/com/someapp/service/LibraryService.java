package com.someapp.service;

import com.someapp.model.Book;
import java.util.List;

public interface LibraryService {

    public List<Book> getAvailableBooks();
}

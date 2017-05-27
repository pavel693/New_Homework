package com.someapp;

import com.someapp.model.Book;
import com.someapp.service.LibraryService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;

public class MainApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");

        LibraryService libraryService = applicationContext.getBean("libraryService", LibraryService.class);

        List<Book> books = libraryService.getAvailableBooks();

        for (Book book : books) {
            System.out.println(book.toString());
        }
    }
}

package app.service;

import app.model.Book;

import java.util.List;

public interface BookService {
    Book addBook(Book book);

    List<Book> getAllBook();

    void deleteBook(Integer id);
}

package app.service;

import app.model.Book;
import app.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;

    @Override
    public Book addBook(Book book){
        bookRepository.save(book);
        return book;
    }

    @Override
    public List<Book> getAllBook(){
        return bookRepository.findAll();
    }

    @Override
    public void deleteBook(Integer id){
        bookRepository.deleteById(id);
    }
}

package app.controller;

import app.model.Book;
import app.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping("/add")
    public Book addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }

    @GetMapping("/all")
    public List<Book> allBook(){
        return bookService.getAllBook();
    }

    @PostMapping("/delete/{id}")
    public void delete(@PathVariable("id") Integer id){
        bookService.deleteBook(id);
    }
}

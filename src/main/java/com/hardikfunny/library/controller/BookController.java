package com.hardikfunny.library.controller;

import com.hardikfunny.library.dto.*;
import com.hardikfunny.library.entity.Author;
import com.hardikfunny.library.entity.Book;
import com.hardikfunny.library.entity.Publisher;
import com.hardikfunny.library.repo.BookRepo;
import com.hardikfunny.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/book")
public class BookController {

    @Autowired
    private BookService bookService;

    //For Saving The Book
    @PostMapping(value = "/saveBook")
    public String addBook(@RequestBody BookSaveDTO bookSaveDTO)
    {
        Book book = bookService.addBook(bookSaveDTO);
        Author author = book.getAuthor();
        Publisher publisher = book.getPublisher();
        return book.getBookTitle()+" Added SuccessFully"+ " with AuthorName: "+author.getAuthorName()+ " and with PublisherName: "+publisher.getPublisherName();
    }

    //Retrieve Method - Retrieve All the Authors
    @GetMapping(value = "/getAllBooks")
    public List<Book> getAllBooks()
    {
        return bookService.getAllbooks();
    }

    //UpDate The Book - Save The Updated Data
    @PutMapping(value = "/updateBook")
    public String updateBook(@RequestBody BookUpdateDTO bookUpdateDTO)
    {
        Book book = bookService.updateBook(bookUpdateDTO);
        Author author = book.getAuthor();
        Publisher publisher = book.getPublisher();
        return book.getBookTitle()+" Updated SuccessFully"+ " with AuthorName: "+author.getAuthorName()+ " and with PublisherName: "+publisher.getPublisherName();
    }


    //Delete The Author - Delete The Author and The book
    @DeleteMapping(value = "/deleteBook/{id}")
    public String deleteBook(@PathVariable(value = "id") int id)
    {
        String bookName = bookService.deleteBook(id);
        return bookName+" Deleted SuccessFully";
    }


}

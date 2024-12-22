package com.hardikfunny.library.service.IMPL;

import com.hardikfunny.library.dto.BookDTO;
import com.hardikfunny.library.dto.BookSaveDTO;
import com.hardikfunny.library.dto.BookUpdateDTO;
import com.hardikfunny.library.entity.Author;
import com.hardikfunny.library.entity.Book;
import com.hardikfunny.library.entity.Publisher;
import com.hardikfunny.library.repo.AuthorRepo;
import com.hardikfunny.library.repo.BookRepo;
import com.hardikfunny.library.repo.PublisherRepo;
import com.hardikfunny.library.service.BookService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceIMPL implements BookService {

    @Autowired
    private BookRepo bookRepo;

    @Autowired
    private AuthorRepo authorRepo;

    @Autowired
    private PublisherRepo publisherRepo;


    @Override
    public Book addBook(BookSaveDTO bookSaveDTO) {

        //Extracting Author From Book Object.
        Author author = bookSaveDTO.getAuthor();
        Publisher publisher = bookSaveDTO.getPublisher();

        //Extracting Ids to Find Object
        int authorId = author.getAuthorId();
        int publisherId = publisher.getPublisherId();

        Book book = new Book(
                bookSaveDTO.getBookTitle(),
                authorRepo.getById(authorId),
                publisherRepo.getById(publisherId)
        );
        bookRepo.save(book);
        return book;
    }

    @Override
    public List<Book> getAllbooks() {
        return bookRepo.findAll();
    }

    @Override
    public Book updateBook(BookUpdateDTO bookUpdateDTO) {

        if (bookRepo.existsById(bookUpdateDTO.getBookid())) {
            Book book = bookRepo.getById(bookUpdateDTO.getBookid());
            book.setBookTitle(bookUpdateDTO.getBookTitle());
            book.setAuthor(authorRepo.getById(bookUpdateDTO.getAuthorId()));
            book.setPublisher(publisherRepo.getById(bookUpdateDTO.getPublisherId()));
            bookRepo.save(book);
            return book;
        }
        else {
            System.out.println("BookId Not Exist!!!");
        }

        return null;

    }

    @Override
    public String deleteBook(int id) {
        if (bookRepo.existsById(id)) {
            Book book = bookRepo.findById(id).get();
            bookRepo.delete(book);
            return book.getBookTitle();
        }
        else {
            System.out.println("Book Not Found!!!");
        }
        return null;
    }


}

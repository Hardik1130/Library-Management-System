package com.hardikfunny.library.service;

import com.hardikfunny.library.dto.BookDTO;
import com.hardikfunny.library.dto.BookSaveDTO;
import com.hardikfunny.library.dto.BookUpdateDTO;
import com.hardikfunny.library.entity.Book;

import java.util.List;

public interface BookService {
    Book addBook(BookSaveDTO bookSaveDTO);


    List<Book> getAllbooks();

    Book updateBook(BookUpdateDTO bookUpdateDTO);

    String deleteBook(int id);
}

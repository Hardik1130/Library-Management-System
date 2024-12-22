package com.hardikfunny.library.dto;

import com.hardikfunny.library.entity.Author;
import com.hardikfunny.library.entity.Book;
import com.hardikfunny.library.entity.Publisher;
import com.hardikfunny.library.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@AllArgsConstructor
@NoArgsConstructor
public class BookSaveDTO {

    private String bookTitle;

    private Author author;

    private Publisher publisher;



    //Contructors ------------------------------
    //For Saving The Book With Author and Publisher.
    public BookSaveDTO(String bookTitle, Author author, Publisher publisher) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.publisher = publisher;
    }

    //Getters And Setters------------------------
    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }


    //ToString

    @Override
    public String toString() {
        return "BookSaveDTO{" +
                "bookTitle='" + bookTitle + '\'' +
                ", author=" + author +
                ", publisher=" + publisher +
                '}';
    }
}

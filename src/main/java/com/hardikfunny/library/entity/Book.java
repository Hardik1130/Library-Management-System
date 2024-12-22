package com.hardikfunny.library.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "programmer")
    @SequenceGenerator(name = "programmer", sequenceName = "programmer", initialValue = 500, allocationSize = 1)
    @Column(name = "book_id",length = 11)
    private int bookId;

    @Column(name = "book_title", length = 45)
    private String bookTitle;

    //For Saving book and Author object--------------
    //For Author
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "AUTHORID")
//    @JsonBackReference
    public Author author;

    //For Publisher
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "PUBLISHERID")
//    @JsonBackReference
    public Publisher publisher;


    //For Saving Book Object Inside Borrow Object
    @OneToMany(mappedBy = "book", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private Set<Borrow> borrows;



    //contructor-----------------------------------
    public Book() {
    }

    //For Saving Book Object in Borrow
    public Book(int bookId, String bookTitle) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
    }

    public Book(String bookTitle, Author author) {
        this.bookTitle = bookTitle;
        this.author = author;
    }

    public Book(String bookTitle, Author author, Publisher publisher) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.publisher = publisher;
    }

    public Book(int bookId, String bookTitle, Author author, Publisher publisher) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.author = author;
        this.publisher = publisher;
    }

    //getters and setters--------------------------------
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public Author getAuthor() {
        return author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookTitle='" + bookTitle + '\'' +
                ", author=" + author +
                ", publisher=" + publisher +
                '}';
    }
}

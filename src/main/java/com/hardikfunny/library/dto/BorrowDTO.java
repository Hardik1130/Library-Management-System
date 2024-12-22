package com.hardikfunny.library.dto;

import com.hardikfunny.library.entity.Book;
import com.hardikfunny.library.entity.User;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;

public class BorrowDTO {

    private LocalDate borrowDate;

    private LocalDate returnDate;

    private Book book;

    private User user;

    //constructors------------------------------

    public BorrowDTO() {
    }

    public BorrowDTO(LocalDate borrowDate, LocalDate returnDate, Book book ,User user)  {
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
        this.book = book;
        this.user = user;
    }

    //Getter and Setter-------------------------

//    public int getBorrowId() {
//        return borrowId;
//    }
//
//    public void setBorrowId(int borrowId) {
//        this.borrowId = borrowId;
//    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }


    //ToString---------------------------------

    @Override
    public String toString() {
        return "BorrowDTO{" +
                "borrowDate=" + borrowDate +
                ", returnDate=" + returnDate +
                ", user=" + user +
                ", book=" + book +
                '}';
    }
}

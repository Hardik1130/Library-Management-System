package com.hardikfunny.library.dto;

import com.hardikfunny.library.entity.Book;
import com.hardikfunny.library.entity.User;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
public class BorrowSaveDTO {

    private LocalDate borrowDate;

    private LocalDate returnDate;

    private User user;

    private Book book;

    //Constructor-----------------------

//    public BorrowSaveDTO(LocalDate borrowDate, LocalDate returnDate, User user, Book book) {
//        this.borrowDate = borrowDate;
//        this.returnDate = returnDate;
//        this.user = user;
//        this.book = book;
//    }


    //Getter And Setter-----------------

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


    //TOString--------------------------


    @Override
    public String toString() {
        return "BorrowSaveDTO{" +
                "borrowDate=" + borrowDate +
                ", returnDate=" + returnDate +
                ", user=" + user +
                ", book=" + book +
                '}';
    }
}

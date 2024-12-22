package com.hardikfunny.library.dto;

import com.hardikfunny.library.entity.Book;
import com.hardikfunny.library.entity.User;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
public class BorrowUpdateDTO {

    private int borrowId;

    private LocalDate borrowDate;

    private LocalDate returnDate;

    private int bookId;

    private int userId;

    //Constructor-------------------------------

    public BorrowUpdateDTO(LocalDate borrowDate, LocalDate returnDate, int bookId, int userId) {
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
        this.bookId = bookId;
        this.userId = userId;
    }


    //Getter and Setter------------------------


    public int getBorrowId() {
        return borrowId;
    }

    public void setBorrowId(int borrowId) {
        this.borrowId = borrowId;
    }

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

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    //TOString---------------------------


    @Override
    public String toString() {
        return "BorrowUpdateDTO{" +
                "borrowId=" + borrowId +
                ", borrowDate=" + borrowDate +
                ", returnDate=" + returnDate +
                ", bookId=" + bookId +
                ", userId=" + userId +
                '}';
    }
}

package com.hardikfunny.library.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "borrow")
public class Borrow {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "borrowGenerator")
    @SequenceGenerator(name = "borrowGenerator", sequenceName = "borrowGenerator", initialValue = 200, allocationSize = 1)
    @Column(name = "borrow_id", length = 11)
    private int borrowId;

    @Column(name = "borrow_Date")
    private LocalDate borrowDate;

    @Column(name = "return_Date")
    private LocalDate returnDate;

    //Foreign Key of User
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "USERID")
    private User user;

    //Foreign Key
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "BOOKID")
    private Book book;



    //Constructors ------------------------------

    public Borrow() {
    }

    public Borrow(LocalDate borrowDate, LocalDate returnDate,  Book book, User user) {
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
        this.book = book;
        this.user = user;
    }

    public Borrow(int borrowId, LocalDate borrowDate, LocalDate returnDate, User user, Book book) {
        this.borrowId = borrowId;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
        this.user = user;
        this.book = book;
    }

    //Getter and Setter--------------------------

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


    //ToString-----------------------------------


    @Override
    public String toString() {
        return "Borrow{" +
                "borrowId=" + borrowId +
                ", borrowDate=" + borrowDate +
                ", returnDate=" + returnDate +
                ", user=" + user +
                ", book=" + book +
                '}';
    }
}

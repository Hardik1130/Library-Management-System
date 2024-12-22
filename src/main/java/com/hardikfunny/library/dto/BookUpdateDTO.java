package com.hardikfunny.library.dto;

public class BookUpdateDTO {

    private int bookid;

    private String bookTitle;


    private int authorId;


    private int publisherId;

    //Contructors-----------------------------------------------

    public BookUpdateDTO() {
    }

    public BookUpdateDTO(int bookid, String bookTitle, int authorId, int publisherId) {
        this.bookid = bookid;
        this.bookTitle = bookTitle;
        this.authorId = authorId;
        this.publisherId = publisherId;
    }

    //Getter and Setters---------------------------------------

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public int getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(int publisherId) {
        this.publisherId = publisherId;
    }


    //ToString -------------------------------------------------


    @Override
    public String toString() {
        return "BookUpdateDTO{" +
                "bookid=" + bookid +
                ", bookTitle='" + bookTitle + '\'' +
                ", authorId=" + authorId +
                ", publisherId=" + publisherId +
                '}';
    }
}

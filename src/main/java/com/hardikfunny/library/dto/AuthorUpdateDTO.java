package com.hardikfunny.library.dto;


public class AuthorUpdateDTO {

    private int authorId;
    private String authorName;

    //Constructor----------------------------------------------
    public AuthorUpdateDTO() {
    }

    public AuthorUpdateDTO(int authorId, String authorName) {
        this.authorId = authorId;
        this.authorName = authorName;
    }

    //Getters and Setters--------------------------------------
    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "AuthorUpdateDTO{" +
                "authorId=" + authorId +
                ", authorName='" + authorName + '\'' +
                '}';
    }
}

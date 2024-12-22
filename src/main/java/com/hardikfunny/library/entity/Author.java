package com.hardikfunny.library.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;


@Entity
@AllArgsConstructor
//@NoArgsConstructor
//@ToString
@Table(name = "author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "author_id",length = 11)
    private int authorId;

    @Column(name = "author_name",length = 45)
    private String authorName;

    @OneToMany(mappedBy = "author", cascade = CascadeType.REMOVE, orphanRemoval = true)
    @JsonIgnore //Important So, that Author cannot show books inside present in it.
    private Set<Book> books;

    //Contructor----------------------------------
    //For Default Constructor
    public Author() {
    }

    //For Saving the book with AuthorId and AuthorName in the Book Object
    public Author(int authorId, String authorName) {
        this.authorId = authorId;
        this.authorName = authorName;
    }

    //For Saving Only Author in the Author Table
    public Author(String authorName) {
        this.authorName = authorName;
    }

    //Getters And Setters-------------------------
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

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    //To String method to get The Author Details with the Books--------------------
    @Override
    public String toString() {
        return "Author{" +
                "authorId=" + authorId +
                ", authorName='" + authorName + '\'' +
//                ", books=" + books +
                '}';
    }
}

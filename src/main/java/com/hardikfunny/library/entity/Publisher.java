package com.hardikfunny.library.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Set;


@Entity
@AllArgsConstructor
@Table(name = "publisher")
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "coder")
    @SequenceGenerator(name = "coder", sequenceName = "coder", initialValue = 100, allocationSize = 1)
    @Column(name = "publisher_id", length = 11)
    private int publisherId;

    @Column(name = "publisher_name")
    private String publisherName;

    @OneToMany(mappedBy = "publisher", cascade = CascadeType.REMOVE, orphanRemoval = true)
    @JsonIgnore //Important So, that Author cannot show books inside present in it.
    public Set<Book> books;

    //Contructors-------------------------------------------------------
    //For Default Constructor
    public Publisher() {

    }

    //For Saving Publisher With Book Object.
    public Publisher(int publisherId, String publisherName) {
        this.publisherId = publisherId;
        this.publisherName = publisherName;
    }

    //Getters And Setters-----------------------------------------------
    public int getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(int publisherId) {
        this.publisherId = publisherId;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public Publisher(String publisherName) {
        this.publisherName = publisherName;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "publisherId=" + publisherId +
                ", publisherName='" + publisherName + '\'' +
//                ", books=" + books +
                '}';
    }
}

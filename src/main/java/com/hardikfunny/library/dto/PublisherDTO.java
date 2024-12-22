package com.hardikfunny.library.dto;

import com.hardikfunny.library.entity.Book;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Set;

//@AllArgsConstructor
@NoArgsConstructor
public class PublisherDTO {
    private int publisherId;
    private String publisherName;

    //Getters And Setters
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


    //Constructors ----------------------------------------
    //For Getting All The Publishers
    public PublisherDTO(int publisherId, String publisherName) {
        this.publisherId = publisherId;
        this.publisherName = publisherName;
    }

    @Override
    public String toString() {
        return "PublisherDTO{" +
                "publisherId=" + publisherId +
                ", publisherName='" + publisherName + '\'' +
                '}';
    }
}

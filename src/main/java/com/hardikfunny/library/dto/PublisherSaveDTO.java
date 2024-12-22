package com.hardikfunny.library.dto;

import com.hardikfunny.library.entity.Book;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PublisherSaveDTO {

    private String publisherName;


    //Getters And Setters
    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }
}

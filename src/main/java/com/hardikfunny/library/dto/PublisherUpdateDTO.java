package com.hardikfunny.library.dto;

public class PublisherUpdateDTO {

    private int publisherId;
    private String publisherName;


    //Constructors -------------------------------------------

    public PublisherUpdateDTO() {
    }

    public PublisherUpdateDTO(int publisherId, String publisherName) {
        this.publisherId = publisherId;
        this.publisherName = publisherName;
    }

    //Getters and Setters -------------------------------------------


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

    //ToString-------------------------------------------------


    @Override
    public String toString() {
        return "PublisherUpdateDTO{" +
                "publisherId=" + publisherId +
                ", publisherName='" + publisherName + '\'' +
                '}';
    }
}

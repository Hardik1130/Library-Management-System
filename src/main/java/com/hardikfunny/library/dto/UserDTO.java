package com.hardikfunny.library.dto;

import jakarta.persistence.Column;

public class UserDTO {

    private int userId;

    private String userName;

    private String email;



    //Contructors-------------------------------

    public UserDTO() {
    }

    public UserDTO(String userName, String email) {
        this.userName = userName;
        this.email = email;
    }

    public UserDTO(int userId, String userName, String email) {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
    }

    //Getter and Setter------------------------
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //ToString------------------------------------


    @Override
    public String toString() {
        return "UserDTO{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

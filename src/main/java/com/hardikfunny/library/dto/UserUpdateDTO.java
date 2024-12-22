package com.hardikfunny.library.dto;

import jakarta.persistence.Column;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class UserUpdateDTO {

    private int userId;

    private String userName;

    private String email;

    //contructors-------------------------
    public UserUpdateDTO(String userName, String email) {
        this.userName = userName;
        this.email = email;
    }

    //Getter And Setter-------------------


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


    //ToString-------------------------

    @Override
    public String toString() {
        return "UserUpdateDTO{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

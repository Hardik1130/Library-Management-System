package com.hardikfunny.library.dto;

public class UserSaveDTO {

    private String userName;

    private String email;

    //Constructors-------------------------

    public UserSaveDTO() {
    }

    public UserSaveDTO(String userName, String email) {
        this.userName = userName;
        this.email = email;
    }

    //Getter and Setter-------------------

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


    //ToString---------------------------


    @Override
    public String toString() {
        return "UserSaveDTO{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

package com.hardikfunny.library.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userSequence")
    @SequenceGenerator(name = "userSequence", sequenceName = "userSequence", initialValue = 1000,allocationSize = 1)
    @Column(name = "user_id", length = 11)
    private int userId;

    @Column(name = "user_name" , length = 45)
    private String userName;

    @Column(name = "email", length = 45)
    private String email;

    //F.K. Mapped
    @OneToMany(mappedBy = "user", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private Set<Borrow> borrows;


    //Constructors-----------------------------

    public User() {
    }

    //For Saving User
    public User(String userName, String email) {
        this.userName = userName;
        this.email = email;
    }

    public User(int userId, String userName, String email) {
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

    //ToString------------------------------
    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

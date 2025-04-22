package com.Models.Dtos;

import com.Models.User;

public class UserDto {
    private String title;
    private User user;

    public UserDto() {
    }


    public UserDto(String title, User user) {
        this.title = title;
        this.user = user;
    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public User getUser() {
        return user;
    }


    public void setUser(User user2) {
        this.user = user2;
    }


    
}

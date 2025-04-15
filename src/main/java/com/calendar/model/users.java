package com.calendar.model;

import java.util.List;

public class users {
    private String username;
    private String password;
    private String email;
    private List<reminder> reminder;
    
    public users(String username, String password, String email, List<reminder> reminder) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.reminder = reminder;
    }

    public users(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<reminder> getReminder() {
        return reminder;
    }

    public void setReminder(List<reminder> reminder) {
        this.reminder = reminder;
    }

    @Override
    public String toString() {
        return "username: " + getUsername() + ", password: " + getPassword() + ", email: " + getEmail() + " reminders: "+getReminder();
    }
    
}

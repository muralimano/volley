package com.muralimanohar.volley;

public class User {

    public String getUsername() {
        return Username;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    private String Username;

    public User(int id, String username, String email, String gender) {
        this.Username = username;
        this.email = email;
        this.gender = gender;
    }

    private String email;
    private String gender;

    public int getId() {
        return id;
    }

    private int id;

}

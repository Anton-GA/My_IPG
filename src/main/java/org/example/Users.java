package org.example;

import java.util.ArrayList;

public class Users {
    private boolean active;
    private String addNumber;
    private String email;
    private String login;
    private String mobile;
    private String name;
    private String password;
    private String passwordAgain;
    private String patronymic;
    private String phone;
    private ArrayList<Object> post;
    private ArrayList<Object> roles;
    private String surname;

    public Users(String email, String login, String name, String password, String passwordAgain, String patronymic, String surname) {
        this.email = email;
        this.login = login;
        this.name = name;
        this.password = password;
        this.passwordAgain = passwordAgain;
        this.patronymic = patronymic;
        this.surname = surname;
    }
}

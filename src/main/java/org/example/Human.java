package org.example;

import java.util.HashMap;
import java.util.Map;

public class Human {
    private final int id;
    private final String name;
    private final String lastname;
    private final String patronymic;

    public Human(int id, String name, String lastname, String patronymic) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.patronymic = patronymic;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPatronymic() {
        return patronymic;
    }
}

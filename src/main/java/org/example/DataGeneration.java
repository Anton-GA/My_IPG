package org.example;

import com.github.javafaker.Faker;

public class DataGeneration {
    Faker faker = new Faker();
    String name;
    String lastname;
    String patronymic;

    public String nameGeneration() {
        return faker.name().firstName();
    }

    public String lastnameGeneration() {
        return faker.name().lastName();
    }

    public String patronymicGeneration() {
        return faker.name().lastName();
    }
}

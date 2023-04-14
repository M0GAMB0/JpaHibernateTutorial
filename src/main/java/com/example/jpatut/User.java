package com.example.jpatut;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name="user_info")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;
    private String name;
    private int age;
    private String country;
    @OneToOne(mappedBy = "user")//bi-directional mapping(Parent to child) is optional
    private Card card;
    public User() {
    }

    public User(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

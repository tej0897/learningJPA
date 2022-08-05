package com.learningJPA.learningJPA.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



// this is Table User in DB.

@Entity
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String role;

    public User() {
        //default constructor as JPA expects it
    }

    public User(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}

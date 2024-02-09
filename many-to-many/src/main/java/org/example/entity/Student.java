package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Student {
    @Id
    private int id;
    private String name;
    private String address;
    @ManyToMany
    private List<Laptop> laptops;
}

package org.example.models;

import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "company")
@ToString
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "company_Name")
    private String name;
    private int age;

    public Company() {
    }

    public Company(Long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
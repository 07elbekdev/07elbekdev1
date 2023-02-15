package org.example.models;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "company")
@Data
@ToString
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "company_Name")
    private String name;
    private int age;
    @OneToOne(cascade = CascadeType.ALL)
    private President president;
    @OneToMany(mappedBy = "company",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Course> course;


    public Company() {
    }

    public Company(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
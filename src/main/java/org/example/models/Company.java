package org.example.models;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "company")
@Data
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "company_Name")
    private String name;
    private int age;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "president_id")
    private President president;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "company")
    private List<Course> course;


    public Company() {
    }

    public Company(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Company{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", age=" + age +
//               ", president=" + president +
               ", course=" + course +
               '}';
    }
}
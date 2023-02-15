package org.example.models;


import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Entity
@Table(name = "course")
@Data
@ToString

public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String directorName;
    private int directorAge;
    private String employeeName;
    private int employeeAge;
    @ManyToOne(fetch = FetchType.EAGER)
    private Company company;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "course")
    private List<Student> student;

    public Course() {
    }

    public Course(String directorName, int directorAge, String employeeName, int employeeAge) {
        this.directorName = directorName;
        this.directorAge = directorAge;
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
//        this.company = company;
//        this.student = student;
    }
}
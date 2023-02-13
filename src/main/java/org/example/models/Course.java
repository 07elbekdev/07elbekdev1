package org.example.models;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import javax.transaction.Transactional;
@Data
@ToString
@Transactional
@Entity
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String DirectorName;
    private int directorAge;
    private String employeeName;
    private int employeeAge;

    public Course() {
    }

    public Course(String directorName, int directorAge, String employeeName, int employeeAge) {
        DirectorName = directorName;
        this.directorAge = directorAge;
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
    }
}
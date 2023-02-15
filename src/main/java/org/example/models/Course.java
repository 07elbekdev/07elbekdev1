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
    private String DirectorName;
    private int directorAge;
    private String employeeName;
    private int employeeAge;
    @OneToMany(fetch = FetchType.LAZY)
    private List<Student> student;

    public Course() {
    }

    public Course(String directorName, int directorAge, String employeeName, int employeeAge) {
        DirectorName = directorName;
        this.directorAge = directorAge;
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
    }
}
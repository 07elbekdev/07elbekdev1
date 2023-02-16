package org.example.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "student")
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "student_Name")
    private String name;
    private int age;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "course_id")
    private Course course;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student { " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                " } ";
    }
}
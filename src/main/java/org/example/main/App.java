package org.example.main;

import org.example.models.Company;
import org.example.models.Course;
import org.example.models.President;
import org.example.models.Student;
import org.example.repository.CompanyRepository;
import org.example.repository.CourseRepository;
import org.example.repository.PresidentRepository;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        President president = new President(1l, "Sadyr Japarov", 23);
        Company company = new Company("Microsoft", 4);
        president.setCompany(company);
        company.setPresident(president);

        List<Course> courses = new ArrayList<>();
        Course course = new Course("Dastan", 16, "Kurmanbek", 16);
        Course course1 = new Course("Ariet", 17, "Elbek", 15);
        courses.add(course);
        courses.add(course1);
        course.setCompany(company);
        course1.setCompany(company);

        List<Student> students = new ArrayList<>();
        Student student = new Student("Dastan", 16);
        Student student1 = new Student("Kurmanbek", 20);
        students.add(student);
        students.add(student1);
        student.setCourse(course1);
        student1.setCourse(course);

        PresidentRepository presidentRepository = new PresidentRepository();
        
    }
}
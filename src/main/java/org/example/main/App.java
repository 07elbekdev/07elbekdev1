package org.example.main;

import org.example.models.Company;
import org.example.models.Course;
import org.example.models.President;
import org.example.models.Student;
import org.example.repository.CompanyRepository;
import org.example.repository.CourseRepository;
import org.example.repository.PresidentRepository;
import org.example.repository.StudentRepository;
import org.example.service.impl.CompanyRepoImpl;
import org.example.service.impl.StudentRepoImpl;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        President president = new President("Putin", 70);
        Company company = new Company("Microsoft", 5);
        president.setCompany(company);
        company.setPresident(president);

        List<Course> courseList = new ArrayList<>();
        Course course = new Course("Someone", 5, "Azamat", 36);
        Course course1 = new Course("IT.KG", 2, "Elbek", 15);
        courseList.add(course);
        courseList.add(course1);
        company.setCourse(courseList);
        course.setCompany(company);
        course1.setCompany(company);

        List<Student> students = new ArrayList<>();
        Student student = new Student("Someone", 12);
        Student student1 = new Student("Daniel", 16);
        students.add(student);
        students.add(student1);
        course.setStudent(students);
        student.setCourse(course);
        student1.setCourse(course);

        PresidentRepository presidentRepository = new PresidentRepository();
        StudentRepository studentRepo  = new StudentRepository();
        CourseRepository courseRepository = new CourseRepository();
        CompanyRepository companyRepository = new CompanyRepository();
        System.out.println(companyRepository.getById(11l));
    }
}
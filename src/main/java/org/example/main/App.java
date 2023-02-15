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
//        Student student = new Student("Ariet",17);
//        Student student1 = new Student("Ariet",17);
//        Student student2 = new Student("Ariet",17);
//        Student student3 = new Student("Ariet",17);
//        Student student4 = new Student("Ariet",17);
//        List<Student>list = new ArrayList<>();
//        list.add(student);
//        list.add(student1);
//        list.add(student2);
//        list.add(student3);
//        list.add(student4);
//        CompanyRepository companyRepository = new CompanyRepository();
//        Company company = new Company("Baisan",6);
//        Company company1 = new Company("Baibek",6);
//        Course course = new Course("Talantbek",40,"Azamat",36,company,list);
//        Course course1 = new Course("Talay",40,"Azamat",36,company1,list);
        CourseRepository courseRepository = new CourseRepository();
        courseRepository.deleteById(8L);
//        companyRepository.save(company1);
//        courseRepository.save(course1);



    }
}
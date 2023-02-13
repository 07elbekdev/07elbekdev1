package org.example;

import org.example.repository.StudentRepository;

public class App {
    public static void main(String[] args) {
        StudentRepository studentRepository = new StudentRepository();
        System.out.println(studentRepository);
    }
}
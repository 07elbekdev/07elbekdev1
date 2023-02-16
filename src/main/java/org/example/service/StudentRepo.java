package org.example.service;

import org.example.models.Student;

public interface StudentRepo {
    void save(Student student);

    Student getById(Long id);

    void findAll();

    void deleteBId(Long id);
}
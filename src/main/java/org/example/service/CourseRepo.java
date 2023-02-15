package org.example.service;

import org.example.models.Course;

import java.util.List;

public interface CourseRepo {
    void save(Course course);

    Course getById(Long id);

    List getAll();

    void deleteById(Long id);

    void deleteAll();
}

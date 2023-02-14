package org.example.servise;

import org.example.models.Course;
import org.example.repository.CourseRepo;

import java.util.List;

public interface CourseRepository {
    void save(Course course);

    Course getById(Long id);

    List getAll();

    void deleteById(Long id);

    void deleteAll();
}

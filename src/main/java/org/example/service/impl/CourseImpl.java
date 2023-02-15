package org.example.service.impl;
import org.example.models.Course;
import org.example.service.CourseRepository;

import java.util.List;

public class CourseImpl implements CourseRepository {
    private static CourseImpl courses;

    @Override
    public void save(Course course) {
        courses.save(course);
    }

    @Override
    public Course getById(Long id) {
         return courses.getById(id);
    }

    @Override
    public List getAll() {
        return courses.getAll();
    }

    @Override
    public void deleteById(Long id) {
        courses.deleteById(id);
    }

    @Override
    public void deleteAll() {
        courses.deleteAll();
    }
}

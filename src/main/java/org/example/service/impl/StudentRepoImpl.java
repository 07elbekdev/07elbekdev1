package org.example.service.impl;

import org.example.models.Student;
import org.example.service.StudentRepo;

public class StudentRepoImpl implements StudentRepo {
    private static StudentRepoImpl studentRepo;

    @Override
    public void save(Student student) {studentRepo.save(student);
    }

    @Override
    public Student getById(Long id) {return studentRepo.getById(id);
    }

    @Override
    public void findAll() {studentRepo.findAll();
    }
}
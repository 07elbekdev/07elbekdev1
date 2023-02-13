package org.example.service;

import org.example.models.Student;

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
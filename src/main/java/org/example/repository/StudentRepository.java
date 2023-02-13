package org.example.repository;

import org.example.configuration.Configuration;
import org.example.models.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class StudentRepository {
    private final SessionFactory sessionfactory = Configuration.getsessionFactory();

    public void save(Student student) {
        try (Session session = sessionfactory.openSession()) {
            session.save(student);
        }
    }

    public Student getById(Long id) {
        try (Session session = sessionfactory.openSession()) {
            return session.get(Student.class, id);
        }
    }

    public void findAll() {
        try (Session session = sessionfactory.openSession()) {
            session.createQuery("select p from Student p").getResultList();
        }
    }
}
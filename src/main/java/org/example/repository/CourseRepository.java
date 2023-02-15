package org.example.repository;

import org.example.configuration.Configuration;
import org.example.models.Course;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class CourseRepository {
    private static final SessionFactory connection = Configuration.getsessionFactory();

    public void save(Course course) {
        try (Session session = connection.openSession()) {
            session.save(course);
            System.out.println("saved!");
        }
    }

    public Course getById(Long id) {
        try (Session session = connection.openSession()) {
            return session.get(Course.class, id);
        }
    }

    public List getAll() {
        try (Session session = connection.openSession()) {
            return session.createQuery("select c from Course c").getResultList();
        }
    }

    public void deleteById(Long id) {
        try (Session session = connection.openSession()) {
            session.beginTransaction();
            session.delete(session.get(Course.class, id));
            session.getTransaction().commit();
        }
    }

    public void deleteAll() {
        try (Session session = connection.openSession()) {
            session.beginTransaction();
            session.createQuery("delete from Course c").executeUpdate();
            session.getTransaction().commit();
        }
    }
}
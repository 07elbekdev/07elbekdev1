package org.example.configuration;

import org.example.models.Company;
import org.example.models.President;
import org.example.models.Student;
import org.example.models.Course;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Environment;

public class Configuration {
    private static final SessionFactory sessionFactory;

    static {
        sessionFactory = new org.hibernate.cfg.Configuration()
                .setProperty(Environment.DRIVER, "org.postgresql.Driver")
                .setProperty(Environment.URL, "jdbc:postgresql://localhost:5432/postgres")
                .setProperty(Environment.PASS, "iamnumber1")
                .setProperty(Environment.USER, "postgres")
                .setProperty(Environment.HBM2DDL_AUTO, "validate")//TODO : use this method differently, first you create it, than after creating the table, you should to change it , to 'validate'.
                .setProperty(Environment.SHOW_SQL, "true")
                .setProperty(Environment.DIALECT, "org.hibernate.dialect.PostgreSQL10Dialect")
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(President.class)
                .addAnnotatedClass(Company.class)
                .buildSessionFactory();
    }

    public static SessionFactory getsessionFactory() {
        return sessionFactory;
    }
}
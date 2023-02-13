package org.example.configuration;

import org.example.models.Course;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Environment;

public class Configuration {
    private static final SessionFactory sessionFactory;

    static {
        sessionFactory = new org.hibernate.cfg.Configuration()
                .setProperty(Environment.DRIVER, "org.postgresql.Driver")
                .setProperty(Environment.URL, "jdbc:postgresql://localhost:5432/postgres")
                .setProperty(Environment.PASS, ",sql.111217S")
                .setProperty(Environment.USER, "postgres")
                .setProperty(Environment.HBM2DDL_AUTO, "validate")
                .setProperty(Environment.SHOW_SQL, "true")
                .setProperty(Environment.DIALECT, "org.hibernate.dialect.PostgreSQL10Dialect")
                .addAnnotatedClass(Course.class)
                .buildSessionFactory();
    }

    public static SessionFactory getsessionFactory() {
        return sessionFactory;
    }
}
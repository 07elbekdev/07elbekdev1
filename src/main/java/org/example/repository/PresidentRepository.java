package org.example.repository;

import org.example.configuration.Configuration;
import org.example.models.President;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.transaction.Transactional;

@Transactional
public class PresidentRepository {
    private final SessionFactory sessionfactory = Configuration.getsessionFactory();

    public void save(President president) {
        try (Session session = sessionfactory.openSession()) {
            session.save(president);
        }
    }

    public President getById(Long id) {
        try (Session session = sessionfactory.openSession()) {
            return session.get(President.class, id);
        }
    }

    public void findAll() {
        try (Session session = sessionfactory.openSession()) {
            session.createQuery("select p from President p").getResultList();
        }
    }
    public void deleteAll(){
        try (Session session = sessionfactory.openSession()){
            session.beginTransaction();
            session.createQuery("delete from President p").executeUpdate();
            session.getTransaction().commit();
        }
    }
}
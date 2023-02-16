package org.example.repository;

import org.example.configuration.Configuration;
import org.example.models.Company;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.transaction.Transactional;

@Transactional
public class CompanyRepository {
    private final SessionFactory sessionfactory = Configuration.getsessionFactory();

    public void save(Company company) {
        try (Session session = sessionfactory.openSession()) {
            session.save(company);
        }
    }

    public Company getById(Long id) {
        try (Session session = sessionfactory.openSession()) {
            return session.get(Company.class, id);
        }
    }

    public void findAll() {
        try (Session session = sessionfactory.openSession()) {
            session.createQuery("select p from Company p").getResultList();
        }
    }

    public void deleteById(Long id) {
        try (Session session = sessionfactory.openSession()) {
            session.beginTransaction();
            Company company = getById(id);
            session.delete(company);
            session.getTransaction().commit();
        }
    }

    public void deleteAll() {
        try (Session session = sessionfactory.openSession()) {
            session.beginTransaction();

            session.createQuery("delete from Company where id is not null")
                    .executeUpdate();

            session.createQuery("delete from Company").executeUpdate();

            session.getTransaction();

        } catch (Exception e) {
            if (sessionfactory != null) {
                sessionfactory.isClosed();
            }
            e.printStackTrace();
        }
    }
}
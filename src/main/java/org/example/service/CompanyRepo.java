package org.example.service;

import org.example.models.Company;

public interface CompanyRepo {
    Company getById(Long id);

    void save(Company company);

    void findAll();

    void deleteAll();
}
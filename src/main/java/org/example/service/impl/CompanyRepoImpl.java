package org.example.service.impl;


import org.example.models.Company;
import org.example.service.CompanyRepo;

public class CompanyRepoImpl implements CompanyRepo {
    private static CompanyRepoImpl companyRepo;

    @Override
    public void save(Company company) {
        companyRepo.save(company);
    }

    @Override
    public Company getById(Long id) {
        return companyRepo.getById(id);
    }

    @Override
    public void findAll() {
        companyRepo.findAll();
    }

    @Override
    public void deleteAll() {
        companyRepo.deleteAll();
    }
}
package org.example.service;

import org.example.models.President;


public class PresidentRepolmpl implements PresidentRepo {
    private static PresidentRepolmpl presidentRepo;

    @Override
    public void save(President president) {presidentRepo.save(president);
    }

    @Override
    public President getById(Long id) {return presidentRepo.getById(id);
    }

    @Override
    public void findAll() {presidentRepo.findAll();
    }

    @Override
    public void deleteAll() {

    }
}




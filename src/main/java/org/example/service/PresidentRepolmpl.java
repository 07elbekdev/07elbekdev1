package org.example.service;

import org.example.models.President;
import org.example.models.Student;

public class PresidentRepolmpl implements PresidentRepo {
    private static PresidentRepo presidentRepo;

    @Override
    public void save(President president) {presidentRepo.save(president);
    }

    @Override
    public President getById(Long id) {return presidentRepo.getById(id);
    }

    @Override
    public void findAll() {presidentRepo.findAll();
    }
}




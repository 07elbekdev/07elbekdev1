package org.example.service;

import org.example.models.President;

public interface PresidentRepo {
    President getById(Long id);

    void save(President president);

    void findAll();
    void deleteAll();
    }
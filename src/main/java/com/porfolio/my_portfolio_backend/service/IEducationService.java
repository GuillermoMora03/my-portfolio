package com.porfolio.my_portfolio_backend.service;

import com.porfolio.my_portfolio_backend.model.Education;

import java.util.List;
import java.util.Optional;

public interface IEducationService {

    // Será para guardar la información y tambien se contempla el update dentro del save
    Education save(Education education);

    // Será para buscar por ID
    Optional<Education> findById(Long id);

    // Será para devolver a todos
    List<Education> findAll();

    // Será para borrar por ID
    void deleteById(Long id);

    List<Education> findByPersonalInfoId(Long personalInfoId);

}

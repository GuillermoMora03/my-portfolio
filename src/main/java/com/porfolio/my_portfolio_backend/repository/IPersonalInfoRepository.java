package com.porfolio.my_portfolio_backend.repository;

import com.porfolio.my_portfolio_backend.model.PersonalInfo;

import java.util.List;
import java.util.Optional;

public interface IPersonalInfoRepository {
    // Será para guardar la información y tambien se contempla el update dentro del save
    PersonalInfo save(PersonalInfo personalInfo);

    // Será para buscar por ID
    Optional<PersonalInfo> findById(Long id);

    // Será para devolver a todos
    List<PersonalInfo> findAll();

    // Será para borrar por ID
    void deleteById(Long id);
}

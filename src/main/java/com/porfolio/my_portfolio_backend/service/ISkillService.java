package com.porfolio.my_portfolio_backend.service;

import com.porfolio.my_portfolio_backend.model.Skill;

import java.util.List;
import java.util.Optional;

public interface ISkillService {

    // Será para guardar la información y tambien se contempla el update dentro del save
    Skill save(Skill skill);

    // Será para buscar por ID
    Optional<Skill> findById(Long id);

    // Será para devolver a todos
    List<Skill> findAll();

    // Será para borrar por ID
    void deleteById(Long id);

    List<Skill> findByPersonalInfoId(Long personalInfoId);
}

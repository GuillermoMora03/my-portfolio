package com.porfolio.my_portfolio_backend.service;

import com.porfolio.my_portfolio_backend.model.Project;

import java.util.List;

public interface IProjectService {
    List<Project> findAll();
    Project save(Project project);
}

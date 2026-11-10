
package com.porfolio.my_portfolio_backend.controller;

import com.porfolio.my_portfolio_backend.dto.ProjectDto;
import com.porfolio.my_portfolio_backend.mapper.ProjectMapper;
import com.porfolio.my_portfolio_backend.model.Project;
import com.porfolio.my_portfolio_backend.service.IProjectService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/projects")
public class ProjectController {

    private final IProjectService projectService;

    // LISTAR PROYECTOS
    @GetMapping
    public String getAll(Model model) {
        List<ProjectDto> projects = projectService.findAll()
                .stream()
                .map(ProjectMapper::toDto)
                .toList();

        model.addAttribute("projects", projects);
        return "projects/list";
    }

    // FORMULARIO PARA CREAR
    @GetMapping("/new-project")
    public String showForm(Model model) {
        model.addAttribute("projectDto", new ProjectDto());
        return "projects/form-project";
    }

    // FORMULARIO PARA EDITAR
    @GetMapping("/edit/{id}")
    public String editProject(@PathVariable Long id, Model model) {

        Project project = projectService.findById(id);

        ProjectDto projectDto = ProjectMapper.toDto(project);

        model.addAttribute("projectDto", projectDto);

        return "projects/form-project";
    }

    // GUARDAR O ACTUALIZAR PROYECTO
    @PostMapping("/save")
    public String saveProject(
            @Valid @ModelAttribute("projectDto") ProjectDto projectDto,
            BindingResult result,
            RedirectAttributes redirectAttributes
    ) {

        if (result.hasErrors()) {
            return "projects/form-project";
        }

        boolean editing = projectDto.getId() != null;

        // Convertir DTO a entidad usando el Mapper
        Project project = ProjectMapper.toEntity(projectDto);

        // Guardar o actualizar en la base de datos
        projectService.save(project);

        redirectAttributes.addFlashAttribute(
                "message",
                editing
                        ? "Proyecto actualizado correctamente."
                        : "Proyecto creado correctamente."
        );

        return "redirect:/projects";
    }

    // ELIMINAR PROYECTO
    @PostMapping("/delete/{id}")
    public String deleteProject(
            @PathVariable Long id,
            RedirectAttributes redirectAttributes
    ) {

        projectService.deleteById(id);

        redirectAttributes.addFlashAttribute(
                "message",
                "Proyecto eliminado correctamente."
        );

        return "redirect:/projects";
    }
}

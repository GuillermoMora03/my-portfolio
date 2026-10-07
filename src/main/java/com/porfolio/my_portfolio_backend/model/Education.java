package com.porfolio.my_portfolio_backend.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Education {
    private Long id;
    private String degree; // Ej: "Ingeniería en Sistemas"
    private String institution; // Ej: "Universidad Autónoma del Estado de Hidalgo"
    private LocalDate startDate;
    private LocalDate endDate; // Puede ser null si esta en curso
    private String description; // Breve descripción de logros o cursos
    private Long personalInfoId; // Clave foránea a PersonalInfo
}

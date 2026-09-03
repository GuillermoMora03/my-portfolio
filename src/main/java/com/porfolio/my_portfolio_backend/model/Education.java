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

    @NotBlank(message = "El nombre del titulo no puede estar vacío")
    private String degree; // Ej: "Ingeniería en Sistemas"

    @NotBlank(message = "El nombre de la institución no puede estar vacío")
    private String institution; // Ej: "Universidad Autónoma del Estado de Hidalgo"

    @NotNull(message = "La fecha de inicio no puede ser nula")
    @PastOrPresent(message = "La fecha de inicio no puede ser futura")
    private LocalDate startDate;

    @PastOrPresent(message = "La fecha de fin no puede ser futura")
    private LocalDate endDate; // Puede ser null si esta en curso

    @NotBlank(message = "La descripción no puede estar vacía")
    private String description; // Breve descripción de logros o cursos

    private Long personalInfoId; // Clave foránea a PersonalInfo
}

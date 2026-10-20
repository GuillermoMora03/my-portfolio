package com.porfolio.my_portfolio_backend.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDto {

    @NotBlank(message = "El nombre de usuario no puede estar vacío.")
    @Min(value = 3, message = "El nombre de usuario debe tener al menos 3 caracteres")
    @Max(value = 50, message = "El nombre de usuario no puede ser mayor a 50 caracteres")
    private String username;

    @NotBlank(message = "La contraseña no puede estar vacía")
    @Min(value = 8, message = "La contraseña debe tener al menos 8 caracteres")
    private String password;

}

package com.porfolio.my_portfolio_backend.exception.hangler;

import com.porfolio.my_portfolio_backend.exception.ValidationException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ValidationException.class)
    public String handleValidationException(ValidationException ex, Model model) {

        model.addAttribute("errors", ex.getBindingResult().getAllErrors());
        model.addAttribute("message", "Se econtraron errores de validación");
        return "error/validation";
    }

}

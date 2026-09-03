package com.porfolio.my_portfolio_backend.exception;

import lombok.Getter;
import org.springframework.validation.BindingResult;

@Getter
public class ValidationException extends RuntimeException {
    private final BindingResult bindingResult;

    public ValidationException(BindingResult bindingResult) {
        super("Errores de validacion: Se encontraron " + bindingResult.getErrorCount());
        this.bindingResult = bindingResult;
    }
}

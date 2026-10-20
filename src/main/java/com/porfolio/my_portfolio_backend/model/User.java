package com.porfolio.my_portfolio_backend.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    private Long id;
    private String username;
    private String password;
    private Boolean enable;
}

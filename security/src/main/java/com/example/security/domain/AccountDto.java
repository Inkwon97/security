package com.example.security.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter @Setter
public class AccountDto {

    private String username;
    private String password;
    private String email;
    private String age;
    private String role;

}

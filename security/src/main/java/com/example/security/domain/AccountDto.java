package com.example.security.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class AccountDto {

    private String username;
    private String password;
    private String email;
    private String age;
    private String role;
}

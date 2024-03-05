package com.example.Security_login_and_registration.datatransferobj;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class RegisterDto {
    private String name;
    private String username;
    private String email;
    private String password;
}

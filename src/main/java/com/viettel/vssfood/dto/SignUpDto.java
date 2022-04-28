package com.viettel.vssfood.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class SignUpDto {
    @NotEmpty(message = "Username is required")
    private String username;

    @NotEmpty(message = "Password is required")
    private String password;

    @NotEmpty(message = "FullName is required")
    private String fullName;

    @Email(message = "Email must be valid")
    @NotNull(message = "Email is required")
    private String email;

    private String phoneNumber;

    private String address;
}

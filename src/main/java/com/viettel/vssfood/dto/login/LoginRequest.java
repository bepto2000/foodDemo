package com.viettel.vssfood.dto.login;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@RequiredArgsConstructor
public class LoginRequest {

    @NotBlank(message = "username cannot be null or empty")
    private String username;

    @NotBlank(message = "password cannot be null or empty")
    private String password;
}

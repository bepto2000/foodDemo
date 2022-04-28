package com.viettel.vssfood.dto.login;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

@Getter
@Setter
public class LoginResponse {
    @Value("${security.jwt.expiration.ms}")
    private Long expiration;
    private String accessToken;
    private String tokenType = "Bearer";

    public LoginResponse(String accessToken) {
        this.accessToken = accessToken;
    }
}

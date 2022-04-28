package com.viettel.vssfood.service;

import com.viettel.vssfood.dto.login.LoginRequest;
import com.viettel.vssfood.dto.login.LoginResponse;

public interface LoginService {
    LoginResponse login(LoginRequest loginRequest);
}

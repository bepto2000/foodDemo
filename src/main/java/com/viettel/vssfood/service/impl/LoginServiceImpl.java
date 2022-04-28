package com.viettel.vssfood.service.impl;

import com.viettel.vssfood.dto.login.LoginRequest;
import com.viettel.vssfood.dto.login.LoginResponse;
import com.viettel.vssfood.model.UserDetail;
import com.viettel.vssfood.service.LoginService;
import com.viettel.vssfood.util.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    AuthenticationManager authenticationManager;
    @Autowired
    JwtUtils jwtUtils;

    @Override
    public LoginResponse login(LoginRequest loginRequest) {
        try {
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));

            SecurityContextHolder.getContext().setAuthentication(authentication);
            UserDetail userDetails = (UserDetail) authentication.getPrincipal();
            String token = jwtUtils.generateJwtToken(userDetails);
            return new LoginResponse(token);
        }catch (Exception e){
            return null;
        }
    }
}

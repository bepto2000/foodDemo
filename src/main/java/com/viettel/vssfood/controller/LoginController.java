package com.viettel.vssfood.controller;

import com.viettel.vssfood.dto.SignUpDto;
import com.viettel.vssfood.dto.login.LoginRequest;
import com.viettel.vssfood.dto.login.LoginResponse;
import com.viettel.vssfood.service.LoginService;
import com.viettel.vssfood.service.impl.UserServiceImpl;
import com.viettel.vssfood.util.JsonResponse;
import com.viettel.vssfood.util.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class LoginController {

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JwtUtils jwtUtils;

    @Autowired
    LoginService loginService;

    @PostMapping("/login")
    public ResponseEntity<JsonResponse> login(@Valid @RequestBody LoginRequest loginRequest){
        LoginResponse response = loginService.login(loginRequest);
        if(response == null){
            return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new JsonResponse("Something went wrong. Please check again!"));
        }
        return ResponseEntity.ok(new JsonResponse("Login success", response));
    }
}

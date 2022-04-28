package com.viettel.vssfood.controller;

import com.viettel.vssfood.dto.SignUpDto;
import com.viettel.vssfood.service.impl.UserServiceImpl;
import com.viettel.vssfood.util.JsonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class SignUpController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @PostMapping(value = "/sign-up")
    public ResponseEntity<JsonResponse> register(@RequestBody @Valid SignUpDto signUpDto){
        SignUpDto signUp = userServiceImpl.addUser(signUpDto);
        return ResponseEntity.ok(new JsonResponse("Register successfully", signUp));
    }
}

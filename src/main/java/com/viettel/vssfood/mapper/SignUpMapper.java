package com.viettel.vssfood.mapper;

import com.viettel.vssfood.dto.SignUpDto;
import com.viettel.vssfood.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class SignUpMapper {

    @Autowired
    PasswordEncoder passwordEncoder;
    public User toEntity(SignUpDto signUpDto, int roleId){
        User user = new User();
        user.setUsername(signUpDto.getUsername());
        user.setPassword(passwordEncoder.encode(signUpDto.getPassword()));
        user.setFullName(signUpDto.getFullName());
        user.setEmail(signUpDto.getEmail());
        user.setAddress(signUpDto.getAddress());
        user.setPhoneNumber(signUpDto.getPhoneNumber());
        user.setCreatedAt(new Date());
        // 1: active, 0: inactive
        user.setStatus(1);
        user.setRoleId(roleId);

        return user;
    }
}

package com.viettel.vssfood.service.impl;

import com.viettel.vssfood.dto.SignUpDto;
import com.viettel.vssfood.entity.User;
import com.viettel.vssfood.exception.AppException;
import com.viettel.vssfood.mapper.SignUpMapper;
import com.viettel.vssfood.repository.UserRepository;
import com.viettel.vssfood.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    SignUpMapper signUpMapper;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    public SignUpDto addUser(SignUpDto newUser){
        // if user has already existed
        if(userRepository.existsByUsername(newUser.getUsername())){
            throw new AppException("username already exists");
        }

        // if email has already existed
        if(userRepository.existsByEmail(newUser.getEmail())){
            throw new AppException("email already exists");
        }

        // role user: 1, role admin: 2
        int roleId = 1;
        User user = signUpMapper.toEntity(newUser, roleId);
        userRepository.save(user);

        return newUser;
    }

}

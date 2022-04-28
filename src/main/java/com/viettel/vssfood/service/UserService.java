package com.viettel.vssfood.service;

import com.viettel.vssfood.dto.SignUpDto;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    SignUpDto addUser(SignUpDto newUser);
}

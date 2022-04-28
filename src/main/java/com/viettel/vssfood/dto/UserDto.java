package com.viettel.vssfood.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private String username;

    private String password;

    private String fullName;

    private String email;

    private String phoneNumber;

    private String address;

    private String roleName;

    private Date createdAt;

    private int status;
}

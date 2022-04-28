package com.viettel.vssfood.mapper;

import com.viettel.vssfood.dto.UserDto;
import com.viettel.vssfood.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserDto toDTO(User userEntity, String roleName) {
        UserDto dto = new UserDto();
        dto.setUsername(userEntity.getUsername());
        dto.setPassword(userEntity.getPassword());
        dto.setRoleName(roleName);
        dto.setFullName(userEntity.getFullName());
        dto.setEmail(userEntity.getEmail());
        dto.setPhoneNumber(userEntity.getPhoneNumber());
        dto.setAddress(userEntity.getAddress());
        dto.setCreatedAt(userEntity.getCreatedAt());
        dto.setStatus(dto.getStatus());
        return dto;
    }


    public User toEntity(UserDto userDTO, Integer roleId) {
        User entity = new User();
        entity.setUsername(userDTO.getUsername());
        entity.setPassword(userDTO.getPassword());
        entity.setEmail(userDTO.getEmail());
        entity.setRoleId(roleId);
        entity.setFullName(userDTO.getFullName());
        entity.setPhoneNumber(userDTO.getPhoneNumber());
        entity.setAddress(userDTO.getAddress());
        entity.setCreatedAt(userDTO.getCreatedAt());
        entity.setStatus(entity.getStatus());
        return entity;
    }

}

package com.viettel.vssfood.service.impl;

import com.viettel.vssfood.dto.UserDto;
import com.viettel.vssfood.entity.Role;
import com.viettel.vssfood.entity.User;
import com.viettel.vssfood.mapper.UserMapper;
import com.viettel.vssfood.model.UserDetail;
import com.viettel.vssfood.repository.RoleRepository;
import com.viettel.vssfood.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    UserMapper userMapper;

    @Override
    public UserDetail loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> userOptional = userRepository.findByUsername(username);

        if (!userOptional.isPresent()){
            throw new UsernameNotFoundException("User Not Found with username: " + username);
        }
        User user = userOptional.get();
        Optional<Role> role = roleRepository.findById(user.getRoleId());
        if (!role.isPresent()) {
            throw new UsernameNotFoundException("User Not Found with username: " + username);
        }

        UserDto userDTO = userMapper.toDTO(user, role.get().getName());
        return UserDetail.getInstance(userDTO);
    }



}

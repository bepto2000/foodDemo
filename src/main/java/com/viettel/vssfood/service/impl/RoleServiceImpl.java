package com.viettel.vssfood.service.impl;

import com.viettel.vssfood.entity.Role;
import com.viettel.vssfood.repository.RoleRepository;
import com.viettel.vssfood.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleRepository roleRepository;

    @Override
    public Role findRoleByName(String roleName) {
        return roleRepository.findByName(roleName).orElse(null);
    }
}

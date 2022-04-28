package com.viettel.vssfood.service;

import com.viettel.vssfood.entity.Role;
import org.springframework.stereotype.Service;

@Service
public interface RoleService {

    Role findRoleByName(String roleName);
}

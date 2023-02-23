package com.example.demohotel.service;

import com.example.demohotel.dto.RoleCreateDto;
import com.example.demohotel.entity.Role;

import java.util.List;

public interface RoleService {
    Role saveRole(RoleCreateDto dto);

    List<Role> findAll();

    Role findById(Long roleId);

    Role updateRole(Long roleId, RoleCreateDto dto);

    String removeRoleById(Long roleId);
}

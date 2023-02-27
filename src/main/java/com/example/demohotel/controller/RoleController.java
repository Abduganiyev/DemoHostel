package com.example.demohotel.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.example.demohotel.dto.RoleCreateDto;
import com.example.demohotel.entity.Role;
import com.example.demohotel.service.RoleService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/roles")
public class RoleController {

    private final RoleService roleService;

    @PostMapping
    public Role save(@RequestBody RoleCreateDto dto) {
        return roleService.saveRole(dto);
    }

    @GetMapping
    public List<Role> findAll() {
        return roleService.findAll();
    }

    @DeleteMapping("/{role_id}")
    public String remove(@PathVariable("role_id") Long roleId) {
        return roleService.removeRoleById(roleId);
    }

}

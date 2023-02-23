package com.example.demohotel.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.demohotel.dto.RoleCreateDto;
import com.example.demohotel.entity.Role;
import com.example.demohotel.exception.NotFoundException;
import com.example.demohotel.repository.RoleRepository;
import com.example.demohotel.service.RoleService;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;


    @Override
    public Role saveRole(RoleCreateDto dto) {
        Role role = new Role(
                dto.getName()
        );
        return roleRepository.save(role);
    }


    @Override
    public List<Role> findAll() {
        return roleRepository.findAll();
    }


    @Override
    public Role findById(Long roleId) {
        Optional<Role> roleOptional = roleRepository.findById(roleId);
        if (roleOptional.isPresent()) {
            return roleOptional.get();
        }
        throw new NotFoundException("Not Found Role");
    }


    @Override
    public Role updateRole(Long roleId, RoleCreateDto dto) {
        Optional<Role> roleOptional = roleRepository.findById(roleId);
        if (roleOptional.isPresent()) {
            Role role = roleOptional.get();
            if (!role.getName().equals(dto.getName())) {
                role.setName(dto.getName());
            }
            return roleRepository.save(role);
        }
        throw new NotFoundException("Not Found Role");
    }


    @Override
    public String removeRoleById(Long roleId) {
        roleRepository.deleteById(roleId);
        return "Successfully Deleted";
    }
}

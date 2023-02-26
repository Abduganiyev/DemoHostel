package com.example.demohotel.service.impl;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.demohotel.dto.UserCreateDto;
import com.example.demohotel.entity.Role;
import com.example.demohotel.entity.User;
import com.example.demohotel.exception.NotFoundException;
import com.example.demohotel.repository.RoleRepository;
import com.example.demohotel.repository.UserRepository;
import com.example.demohotel.service.UserService;

import java.util.*;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    @Override
    public List<User> findAllUser() {
        return userRepository.findAll();
    }


    @Override
    public User findUserById(Long userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new NotFoundException("Not Found User with ID: " + userId));
    }


    @Override
    public User updateUser(Long userId, UserCreateDto dto) {
        Optional<User> userOptional = userRepository.findById(userId);
        if (userOptional.isPresent()) {

            User user = userOptional.get();

            if (!user.getFirstname().equals(dto.getFirstname())) {
                user.setFirstname(dto.getFirstname());
            }

            if (!user.getLastname().equals(dto.getLastname())) {
                user.setLastname(dto.getLastname());
            }

            if (!user.getEmail().equals(dto.getEmail())) {
                user.setEmail(dto.getEmail());
            }

            Set<Role> newRoleSet = new HashSet<>();
            Set<Long> roleIds1 = dto.getRoleIds();
            for (Long aLong : roleIds1) {
                Optional<Role> byId = roleRepository.findById(aLong);
                if (byId.isPresent()) {
                    Role role = byId.get();
                    newRoleSet.add(role);
                } else {
                    throw new NotFoundException("Not Found Role with ID: " + byId);
                }
            }

            Set<Role> roles = user.getRoles();
            roles.addAll(newRoleSet);
            user.setRoles(roles);

            return userRepository.save(user);
        }
        throw new NotFoundException("Not Found User with ID: " + userId);
    }

    @Override
    public String removeUser(Long userId) {
        userRepository.deleteById(userId);

        return "Successfully Deleted";
    }

    @Override
    public User saveUser(UserCreateDto dto) {
        Set<Role> roles = new HashSet<>();
        for (Long roleId : dto.getRoleIds()) {
            roles.add(roleRepository.findById(roleId).get());
        }
        User user = new User(dto.getFirstname(), dto.getLastname(), dto.getEmail(), roles);
        User save = userRepository.save(user);
        return save;
    }
}

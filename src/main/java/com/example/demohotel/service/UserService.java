package com.example.demohotel.service;

import com.example.demohotel.dto.UserCreateDto;
import com.example.demohotel.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAllUser();

    User findUserById(Long userId);

    User updateUser(Long userId, UserCreateDto dto);

    String removeUser(Long userId);
}

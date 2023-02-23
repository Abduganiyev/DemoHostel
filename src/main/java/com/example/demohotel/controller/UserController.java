package com.example.demohotel.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.example.demohotel.dto.UserCreateDto;
import com.example.demohotel.entity.User;
import com.example.demohotel.service.UserService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    @GetMapping
    public List<User> findAll() {
        return userService.findAllUser();
    }


    @GetMapping("/{user_id}")
    public User findById(@PathVariable("user_id") Long userId) {
        return userService.findUserById(userId);
    }

    @PutMapping("/{user_id}")
    public User edit(@PathVariable("user_id") Long userId,
                        @RequestBody UserCreateDto dto) {
        return userService.updateUser(userId, dto);
    }

    @DeleteMapping("/{user_id}")
    public String remove(@PathVariable("user_id") Long userId) {
        return userService.removeUser(userId);
    }


}

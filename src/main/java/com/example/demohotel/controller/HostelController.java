package com.example.demohotel.controller;

import com.example.demohotel.dto.RoleCreateDto;
import com.example.demohotel.entity.Hostel;
import com.example.demohotel.entity.Role;
import com.example.demohotel.service.HostelService;
import com.example.demohotel.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/hostels")
public class HostelController {
    private final HostelService hostelService;

    @GetMapping
    public List<Hostel> findAll() {
        return hostelService.findAll();
    }
}

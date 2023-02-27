package com.example.demohotel.service;

import com.example.demohotel.dto.HostelCreateDto;
import com.example.demohotel.dto.UserCreateDto;
import com.example.demohotel.entity.Hostel;
import com.example.demohotel.entity.User;

import java.util.List;

public interface HostelService {
    List<Hostel> findAll();

    Hostel findHostelById(Long hostelId);



    String removeHostel(Long hostelId);

    Hostel saveHostel(HostelCreateDto dto);

    Hostel updateHostel(Long hostelId, HostelCreateDto dto);
}

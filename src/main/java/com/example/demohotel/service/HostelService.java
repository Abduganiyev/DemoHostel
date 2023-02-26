package com.example.demohotel.service;

import com.example.demohotel.dto.UserCreateDto;
import com.example.demohotel.entity.Hostel;
import com.example.demohotel.entity.User;

import java.util.List;

public interface HostelService {
    List<Hostel> findAllHostel();

    Hostel findHostelById(Long hostelId);



    String removeHostel(Long hostelId);
}

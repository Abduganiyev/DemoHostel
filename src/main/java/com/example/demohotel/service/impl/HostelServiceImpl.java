package com.example.demohotel.service.impl;

import com.example.demohotel.entity.Hostel;
import com.example.demohotel.service.HostelService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HostelServiceImpl implements HostelService {
    @Override
    public List<Hostel> findAllHostel() {
        return null;
    }

    @Override
    public Hostel findHostelById(Long hostelId) {
        return null;
    }

    @Override
    public String removeHostel(Long hostelId) {
        return null;
    }
}

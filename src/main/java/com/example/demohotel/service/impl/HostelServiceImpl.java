package com.example.demohotel.service.impl;

import com.example.demohotel.dto.HostelCreateDto;
import com.example.demohotel.entity.Hostel;
import com.example.demohotel.repository.HostelRepository;
import com.example.demohotel.service.HostelService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.DataTruncation;
import java.util.List;

@Service
@RequiredArgsConstructor
public class HostelServiceImpl implements HostelService {
    private final HostelRepository hostelRepository;

    @Override
    public List<Hostel> findAll() {
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

    @Override
    public Hostel saveHostel(HostelCreateDto dto) {
        Hostel hostel = new Hostel(dto.getName(),
                dto.getRoom_counts(),
                dto.getFree_room_counts(),
                dto.getFull_room_counts(),
                dto.getPrestige(),
                dto.getAddress(),
                dto.getFormed(),
                dto.getWorkers());
        Hostel save = hostelRepository.save(hostel);
        return save;
    }

    @Override
    public Hostel updateHostel(Long hostelId, HostelCreateDto dto) {
        return null;
    }
}

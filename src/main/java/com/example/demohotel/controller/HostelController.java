package com.example.demohotel.controller;

import com.example.demohotel.dto.HostelCreateDto;
import com.example.demohotel.entity.Hostel;
import com.example.demohotel.service.HostelService;
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


    @PostMapping
    public Hostel save(@RequestBody HostelCreateDto dto) {
        return hostelService.saveHostel(dto);
    }


    @GetMapping("/{hostel_id}")
    public Hostel findById(@PathVariable("hostel_id") Long hostelId) {
        return hostelService.findHostelById(hostelId);
    }

    @PutMapping("/{hostel_id}")
    public Hostel edit(@PathVariable("hostel_id") Long hostelId,
                     @RequestBody HostelCreateDto dto) {
        return hostelService.updateHostel(hostelId, dto);
    }

    @DeleteMapping("/{hostel_id}")
    public String remove(@PathVariable("hostel_id") Long hostelId) {
        return hostelService.removeHostel(hostelId);
    }

}

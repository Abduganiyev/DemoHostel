package com.example.demohotel.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HostelCreateDto {
    private String name;
    private Long room_counts;
    private Long free_room_counts;
    private Long full_room_counts;
    private String prestige;
    private String address;
    private String formed;
    private Long workers;
}

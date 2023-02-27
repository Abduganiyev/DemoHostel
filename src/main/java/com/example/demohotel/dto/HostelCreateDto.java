package com.example.demohotel.dto;

import javax.persistence.Column;

public class HostelCreateDto {
    private String name;
    private Long room_counts;
    private Long free_room_counts;
    private Long full_room_counts;
    private boolean prestige;
    private String address;
    private String formed;
}

package com.example.demohotel.entity;

import com.example.demohotel.entity.template.AbcEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "hostels")
public class Hostel extends AbcEntity {
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Long room_counts;

    @Column(nullable = false)
    private Long free_room_counts;

    @Column(nullable = false)
    private Long full_room_counts;

    @Column(nullable = false)
    private boolean prestige;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String formed;

}

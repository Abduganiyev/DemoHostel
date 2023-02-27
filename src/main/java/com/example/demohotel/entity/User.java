package com.example.demohotel.entity;


import lombok.*;
import com.example.demohotel.entity.template.AbcEntity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User extends AbcEntity {

    @Column(nullable = false)
    private String firstname;

    @Column
    private String lastname;

    @Column(nullable = false, unique = true)
    private String email;

    @ManyToMany(fetch = FetchType.LAZY)
    private Set<Role> roles = new HashSet<>();

    @ManyToMany(fetch = FetchType.LAZY)
    private Set<Hostel> hosels = new HashSet<>();
}

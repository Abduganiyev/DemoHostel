package com.example.demohotel.dto;


import com.example.demohotel.entity.Hostel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserCreateDto {

    private String firstname;
    private String lastname;
    private String email;
    private Set<Long> roleIds;
    private Set<Long> hostelsId;
}

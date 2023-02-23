package com.example.demohotel.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserCreateDto {

    private String firstname;
    private String lastname;
    private String email;
    private Set<Long> roleIds;
}

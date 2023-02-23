package com.example.demohotel.entity;


import lombok.*;
import org.hibernate.Hibernate;
import com.example.demohotel.entity.template.AbcEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Role extends AbcEntity{

    @Column(nullable = false, unique = true)
    private String name;
}

package com.example.demohotel.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demohotel.entity.Role;
public interface RoleRepository extends JpaRepository<Role, Long> {
}

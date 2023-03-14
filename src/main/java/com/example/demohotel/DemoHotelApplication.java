package com.example.demohotel;

import com.example.demohotel.dto.RoleCreateDto;
import com.example.demohotel.service.RoleService;
import com.example.demohotel.service.impl.RoleServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AllArgsConstructor
public class DemoHotelApplication implements CommandLineRunner{
    private final RoleService roleService;

    public static void main(String[] args) {
        SpringApplication.run(DemoHotelApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        roleService.saveRole(new RoleCreateDto("Xodim"));
        roleService.saveRole(new RoleCreateDto("Istemolchi"));
    }
}

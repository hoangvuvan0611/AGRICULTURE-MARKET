package com.agrimarket.controller;

import com.agrimarket.repo.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/role")
@RequiredArgsConstructor
public class RoleController {
    private final RoleRepository roleRepository;
}

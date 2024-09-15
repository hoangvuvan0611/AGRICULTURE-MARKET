package com.agrimarket.service;

import com.agrimarket.dto.response.RoleDTO;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.UUID;

public class RoleServiceImpl implements RoleService {
    @Override
    public List<RoleDTO> getAllRole() {
        return List.of();
    }

    @Override
    public RoleDTO getRoleById(UUID id) {
        return null;
    }

    @Override
    @Transactional(rollbackOn = Exception.class)
    public void createRole(String roleName, String description) {

    }

    @Override
    public void updateRole(UUID id, String roleName, String description) {

    }
}

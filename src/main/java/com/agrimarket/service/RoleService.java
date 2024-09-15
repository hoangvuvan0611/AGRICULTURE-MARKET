package com.agrimarket.service;

import com.agrimarket.dto.response.RoleDTO;

import java.util.List;
import java.util.UUID;

public interface RoleService {
    List<RoleDTO> getAllRole();
    RoleDTO getRoleById(UUID id);
    void createRole(String roleName, String description);
    void updateRole(UUID id, String roleName, String description);   
}

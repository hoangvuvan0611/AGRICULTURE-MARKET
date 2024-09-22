package com.agrimarket.service;

import com.agrimarket.constant.enums.RoleEnum;
import com.agrimarket.dto.request.role.CreateRoleRequest;
import com.agrimarket.dto.response.RoleDTO;

import java.util.List;
import java.util.UUID;

public interface RoleService {
    List<RoleDTO> getAllRole();
    RoleDTO getRoleById(UUID id);
    void createRole(CreateRoleRequest createRoleRequest);
    void updateRole(UUID id, String roleName, String description);
    boolean existByRoleName(RoleEnum roleName);
}

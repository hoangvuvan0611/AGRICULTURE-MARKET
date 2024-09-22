package com.agrimarket.service;

import com.agrimarket.constant.enums.RoleEnum;
import com.agrimarket.dto.request.role.CreateRoleRequest;
import com.agrimarket.dto.response.RoleDTO;
import com.agrimarket.entity.Role;
import com.agrimarket.exception.LogicException;
import com.agrimarket.repo.RoleRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

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
    public void createRole(CreateRoleRequest createRoleRequest) {
        // Kiem tra xem ten truyen vao co hop le khong (nam trong class enum da dinh nghia khong)
        RoleEnum roleEnum;
        try {
            roleEnum = RoleEnum.valueOf(createRoleRequest.getName());
        } catch (Exception ex) {
            throw new LogicException(HttpStatus.BAD_REQUEST.value(), "common.input.name.role.name.not.valid");
        }

        // Kiem tra xem role nay da ton tai trong database chua
        boolean isExist = existByRoleName(roleEnum);
        if (isExist) {
            throw new LogicException(HttpStatus.BAD_REQUEST.value(), "common.input.name.exist");
        }
        Role role = Role.builder()
                .roleName(roleEnum)
                .description(createRoleRequest.getDescription())
                .build();
        try {
            roleRepository.save(role);
        } catch (Exception ex) {
            log.error("Create new role with error: {}",ex.getMessage());
            throw new LogicException(HttpStatus.INTERNAL_SERVER_ERROR.value(), "common.create.new.failure");
        }
    }

    @Override
    public void updateRole(UUID id, String roleName, String description) {

    }

    @Override
    public boolean existByRoleName(RoleEnum roleName) {
        return roleRepository.existsByRoleName(roleName);
    }
}

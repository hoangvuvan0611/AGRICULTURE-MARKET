package com.agrimarket.repo;

import com.agrimarket.constant.enums.RoleEnum;
import com.agrimarket.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
    boolean existsByRoleName(RoleEnum roleName);
}

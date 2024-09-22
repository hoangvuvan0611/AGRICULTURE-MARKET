package com.agrimarket.dto.request.role;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
public class CreateRoleRequest {
    @NotBlank(message = "common.input.name.not.blank")
    private String name;

    @NotBlank(message = "common.input.description.not.blank")
    private String description;
}

package com.agrimarket.controller;

import com.agrimarket.config.lang.Translator;
import com.agrimarket.dto.request.role.CreateRoleRequest;
import com.agrimarket.dto.response.ResponseData;
import com.agrimarket.dto.response.ResponseError;
import com.agrimarket.exception.LogicException;
import com.agrimarket.service.RoleService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/role")
@RequiredArgsConstructor
public class RoleController {

    private final RoleService roleService;

    @PostMapping(path = "/create")
    public ResponseData<?> createRole(@Valid @RequestBody CreateRoleRequest request) {
        try {
            roleService.createRole(request);
            return new ResponseData<>(Translator.toLocale("role.add.success"), null);
        } catch (LogicException lEx) {
            return new ResponseError<>(lEx.getErrorCode(), lEx.getMessage());
        } catch (Exception e) {
            return new ResponseError<>(HttpStatus.BAD_REQUEST.value(), e.getMessage());
        }
    }
}

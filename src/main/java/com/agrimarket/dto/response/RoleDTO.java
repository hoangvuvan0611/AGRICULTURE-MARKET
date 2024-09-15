package com.agrimarket.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RoleDTO {
    private String roleName;
    private String description;
    private Date creationDate;
    private Date lastUpdateDate;
}

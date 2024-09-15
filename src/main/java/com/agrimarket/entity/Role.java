package com.agrimarket.entity;

import com.agrimarket.constant.enums.RoleEnum;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "ROLES")
@Table(name = "ROLES")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column( name = "role_name", nullable = false, unique = true)
    @Enumerated(EnumType.STRING)
    private RoleEnum roleName;

    @Column(name = "description")
    private String description;

    @CreationTimestamp
    @Column(name = "creation_date")
    private Timestamp creationDate;

    @UpdateTimestamp
    @Column(name = "last_update_date")
    private Timestamp lastUpdateDate;

    @JsonIgnore
    @ManyToMany(mappedBy = "roles")
    private Set<Staff> staffSet = new HashSet<>();
}

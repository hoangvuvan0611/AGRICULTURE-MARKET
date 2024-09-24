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
@Entity
@Table(name = "ROLES")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column( name = "ROLE_NAME", nullable = false, unique = true)
    @Enumerated(EnumType.STRING)
    private RoleEnum roleName;

    @Column(name = "DESCRIPTION")
    private String description;

    @CreationTimestamp
    @Column(name = "CREATE_AT")
    private Timestamp createAt;

    @UpdateTimestamp
    @Column(name = "UPDATE_AT")
    private Timestamp updateAt;

    @JsonIgnore
    @ManyToMany(mappedBy = "roles")
    private Set<Staff> staffSet = new HashSet<>();
}

package com.agrimarket.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name = "USERS")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false, name = "USER_NAME")
    private String userName;

    @Column(nullable = false, name = "PASSWORD")
    private String password;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "DATE_OF_BIRTH")
    private String dateOfBirth;

    @Column(name = "GENDER")
    private String gender;

    @Column(name = "IS_VERIFIED")
    private boolean isVerified;

    @Column(name = "IS_ACTIVATED")
    private boolean isActivated;

    @CreationTimestamp
    @Column(name = "CREATE_AT")
    private Timestamp createAT;

    @UpdateTimestamp
    @Column(name = "UPDATE_AT")
    private Timestamp updateAt;

    @Lob
    @Column(name = "AVATAR")
    private byte[] avatar;
}

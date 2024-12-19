package com.m3kong.flashcard.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.util.UUID;

@Data
@Entity
@Table(name = "account")
@DynamicInsert
@DynamicUpdate
public class AccountEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(columnDefinition = "varchar(255) comment 'user name'", nullable = false)
    private String userName;

    @Column(columnDefinition = "varchar(255) comment 'account email'", nullable = false, unique = true)
    private String email;

    @Column(columnDefinition = "varchar(255) comment 'hash password'", nullable = false)
    private String hashPassword;

    @Column(columnDefinition = "varchar(255) comment 'public key of hash password'", nullable = false)
    private String saltKey;
}

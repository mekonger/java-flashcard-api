package com.m3kong.flashcard.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Comment;
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

    @Comment("user name")
    @Column(columnDefinition = "varchar(255)", nullable = false)
    private String userName;

    @Comment("account email")
    @Column(columnDefinition = "varchar(255)", nullable = false, unique = true)
    private String email;

    @Comment("hash password")
    @Column(columnDefinition = "varchar(255)", nullable = false)
    private String hashPassword;

    @Comment("public key of hash password")
    @Column(columnDefinition = "varchar(255)", nullable = false)
    private String saltKey;

    @Comment("created time")
    @Column(columnDefinition = "bigint", nullable = false)
    private long createdTime;

    @Comment("updated time")
    @Column(columnDefinition = "bigint", nullable = false)
    private long updatedTime;
}

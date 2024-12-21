package com.m3kong.flashcard.repository;

import com.m3kong.flashcard.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AccountRepository extends JpaRepository<AccountEntity, UUID> {
    AccountEntity findByEmail(String email);
}

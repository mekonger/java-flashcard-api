package com.m3kong.flashcard.repository;

import com.m3kong.flashcard.entity.TokenEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface TokenRepository extends JpaRepository<TokenEntity, UUID> {
    Optional<TokenEntity> findByToken(String token);
    Optional<TokenEntity> findByUserId(UUID userId);
    void deleteByToken(String token);
    void deleteByUserId(UUID userId);
}

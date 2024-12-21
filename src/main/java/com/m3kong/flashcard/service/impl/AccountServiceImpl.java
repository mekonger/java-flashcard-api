package com.m3kong.flashcard.service.impl;

import com.m3kong.flashcard.dto.request.account.AccountChangePasswordRequest;
import com.m3kong.flashcard.dto.request.account.AccountCreateRequest;
import com.m3kong.flashcard.dto.request.account.AccountResetPassword;
import com.m3kong.flashcard.dto.response.token.TokenResponse;
import com.m3kong.flashcard.entity.AccountEntity;
import com.m3kong.flashcard.repository.AccountRepository;
import com.m3kong.flashcard.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements AccountService {
    private AccountRepository repository;


    @Override
    public TokenResponse register(AccountCreateRequest request) {
        return null;
    }

    @Override
    public TokenResponse login(String email, String password) {
        return null;
    }

    @Override
    public boolean changePassword(AccountChangePasswordRequest request) {
        return false;
    }

    @Override
    public boolean resetPassword(AccountResetPassword request) {
        return false;
    }
}

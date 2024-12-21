package com.m3kong.flashcard.service;

import com.m3kong.flashcard.dto.request.account.AccountChangePasswordRequest;
import com.m3kong.flashcard.dto.request.account.AccountCreateRequest;
import com.m3kong.flashcard.dto.request.account.AccountResetPassword;
import com.m3kong.flashcard.dto.response.token.TokenResponse;

public interface AccountService {
    TokenResponse register(AccountCreateRequest request);
    TokenResponse login(String email, String password);
    boolean changePassword(AccountChangePasswordRequest request);
    boolean resetPassword(AccountResetPassword request);
}

package com.m3kong.flashcard.controller;

import com.m3kong.flashcard.service.AccountService;
import com.m3kong.flashcard.service.TokenService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/account")
@AllArgsConstructor
public class AccountController {

    final private AccountService accountService;
    final private TokenService tokenService;
}

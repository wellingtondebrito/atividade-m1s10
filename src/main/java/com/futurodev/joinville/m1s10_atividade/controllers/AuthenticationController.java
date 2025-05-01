package com.futurodev.joinville.m1s10_atividade.controllers;

import com.futurodev.joinville.m1s10_atividade.dtos.authentications.AuthenticationRequestDto;
import com.futurodev.joinville.m1s10_atividade.dtos.authentications.AuthenticationResponseDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("auth")
public class AuthenticationController {

    @PostMapping
    public AuthenticationResponseDto authenticate(@RequestBody AuthenticationRequestDto request) {
        return AuthenticationResponseDto.builder()
                .type("Basic")
                .token("12546lkshgsda")
                .build();
    }
}

package com.futurodev.joinville.m1s10_atividade.services;

import com.futurodev.joinville.m1s10_atividade.dtos.authentications.AuthenticationRequestDto;
import com.futurodev.joinville.m1s10_atividade.dtos.authentications.AuthenticationResponseDto;

public interface AuthenticationService {

    AuthenticationResponseDto authenticate(AuthenticationRequestDto request);
}

package com.futurodev.joinville.m1s10_atividade.dtos.authentications;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AuthenticationResponseDto {
    private String type;
    private String token;
}

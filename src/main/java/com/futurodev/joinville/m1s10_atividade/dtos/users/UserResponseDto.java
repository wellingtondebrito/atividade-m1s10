package com.futurodev.joinville.m1s10_atividade.dtos.users;

import com.futurodev.joinville.m1s10_atividade.enums.UserRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseDto {
    private Long id;
    private String name;
    private String username;
    private UserRole role;
}

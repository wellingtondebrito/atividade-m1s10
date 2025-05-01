package com.futurodev.joinville.m1s10_atividade.dtos.organizations;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrganizationResponseDto {
    private Long id;
    private String name;
    private String contact;
}

package com.futurodev.joinville.m1s10_atividade.services;

import com.futurodev.joinville.m1s10_atividade.dtos.organizations.OrganizationRequestDto;
import com.futurodev.joinville.m1s10_atividade.dtos.organizations.OrganizationResponseDto;

import java.util.List;

public interface OrganizationService  {

    OrganizationResponseDto getOrganizationById(Long id);

    List<OrganizationResponseDto> getAllOrganizations();

    OrganizationResponseDto createOrganization(OrganizationRequestDto organizationDto);

    OrganizationResponseDto updateOrganization(Long id, OrganizationRequestDto organizationDto);

    void deleteOrganization(Long id);


}

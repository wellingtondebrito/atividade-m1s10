package com.futurodev.joinville.m1s10_atividade.repositories;

import com.futurodev.joinville.m1s10_atividade.entities.Organization;
import com.futurodev.joinville.m1s10_atividade.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {
}

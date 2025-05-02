package com.futurodev.joinville.m1s10_atividade.services;


import com.futurodev.joinville.m1s10_atividade.dtos.users.UserRequestDto;
import com.futurodev.joinville.m1s10_atividade.dtos.users.UserResponseDto;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {

    UserResponseDto createUser(UserRequestDto userDto);
    List<UserResponseDto> getAllUsers();
    UserResponseDto getUserById(Long id);
    UserResponseDto updateUser(Long id, UserRequestDto userDto);
    void deleteUser(Long id);

}

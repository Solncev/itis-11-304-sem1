package com.solncev.service;

import com.solncev.dto.UserDto;
import com.solncev.dto.UserRegistrationDto;

import java.util.List;

public interface UserService {

    List<UserDto> getAll();

    UserDto get(Integer id);

    UserDto getByLogin(String login);

    void register(UserRegistrationDto user);
}

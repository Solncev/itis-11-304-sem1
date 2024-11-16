package com.solncev.service.impl;

import com.solncev.dao.UserDao;
import com.solncev.dao.impl.UserDaoImpl;
import com.solncev.dto.UserDto;
import com.solncev.dto.UserRegistrationDto;
import com.solncev.entity.User;
import com.solncev.service.UserService;
import com.solncev.util.PasswordUtil;

import java.util.List;
import java.util.stream.Collectors;

public class UserServiceImpl implements UserService {

    private final UserDao userDao = new UserDaoImpl();

    @Override
    public List<UserDto> getAll() {
        return userDao.getAll().stream().map(
                u -> new UserDto(u.getName(), null, u.getLastname())
        ).collect(Collectors.toList());
    }

    @Override
    public UserDto get(Integer id) {
        return null;
    }

    @Override
    public UserDto getByLogin(String login) {
         User u = userDao.getByLogin(login);
        return new UserDto(u.getName(), null, u.getLastname());
    }

    @Override
    public void register(UserRegistrationDto user) {
        userDao.save(new User(
                user.getName(),
                user.getLastname(),
                user.getLogin(),
                PasswordUtil.encrypt(user.getPassword())
        ));
    }
}

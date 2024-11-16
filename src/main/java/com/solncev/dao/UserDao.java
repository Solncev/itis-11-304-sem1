package com.solncev.dao;

import com.solncev.entity.User;

import java.util.List;

public interface UserDao {

    User get(Integer id);

    List<User> getAll();

    void save(User user);

}

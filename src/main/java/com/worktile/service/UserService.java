package com.worktile.service;

import com.worktile.dao.User;

import java.util.List;

public interface UserService {

    int getUserById(int id);

    List<User> getUsers();

    int insert(User user);
}
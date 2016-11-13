package com.polovnev.service.impl;

import com.polovnev.dao.UserDao;
import com.polovnev.model.User;
import com.polovnev.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getAllUsers() {
        return userDao.getUsers();
    }
}

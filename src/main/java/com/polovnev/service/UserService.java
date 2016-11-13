package com.polovnev.service;

import com.polovnev.model.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {

    List<User> getAllUsers();
}

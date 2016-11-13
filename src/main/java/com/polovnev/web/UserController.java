package com.polovnev.web;

import com.polovnev.dao.UserDao;
import com.polovnev.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(method = RequestMethod.GET)
    public String getUsers(ModelMap model) {
        List<User> users = userDao.getUsers();
        model.addAttribute("users", users);
        model.addAttribute("message", "Hello world!");
        return "index";
    }
}
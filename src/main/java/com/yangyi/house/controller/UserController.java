package com.yangyi.house.controller;

import com.yangyi.house.common.User;
import com.yangyi.house.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/user/")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "login.do", method = RequestMethod.POST)
    public List<User> getUsers() {
        return userService.getUsers();
    }


}

package com.yangyi.house.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yangyi.house.common.User;
import com.yangyi.house.mapper.UserMapper;

@Service
public class UserService {


    @Autowired
    private UserMapper userMapper;

    public List<User> getUsers() {
        return userMapper.selectUsers();
    }

}


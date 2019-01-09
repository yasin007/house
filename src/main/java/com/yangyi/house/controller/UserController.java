package com.yangyi.house.controller;

import com.yangyi.house.common.User;
import com.yangyi.house.serverResponse.ServerResponse;
import com.yangyi.house.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;

@Controller
@RequestMapping("/accounts/")
public class UserController {

    @Autowired
    private UserService userService;


    /**
     * 注册提交:1.注册验证 2.发送邮件
     *
     * @param user
     * @return
     */
    @RequestMapping(value = "register", method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> register(User user) {
        return userService.register(user);
    }

    /**
     * 发送邮件后验证
     *
     * @param key
     * @return
     */
    @RequestMapping("verify")
    public String verify(String key) {
        return "html";
    }
}

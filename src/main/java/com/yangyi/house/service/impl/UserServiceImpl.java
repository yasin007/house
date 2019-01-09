package com.yangyi.house.service.impl;

import com.yangyi.house.common.User;
import com.yangyi.house.mapper.UserMapper;
import com.yangyi.house.serverResponse.ServerResponse;
import com.yangyi.house.service.MailService;
import com.yangyi.house.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yangyi.house.utils.HashUtils;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
public class UserServiceImpl implements UserService {


    @Autowired
    private MailService mailService;

    @Autowired
    private UserMapper userMapper;


    /**
     * 注册service实现
     *
     * @param user
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public ServerResponse<String> register(User user) {
        int resultCount = userMapper.checkUsername(user.getName());
        if (resultCount > 0) {
            return ServerResponse.createByErrorMessage("用户已经注册");
        }
        user.setPasswd(HashUtils.encryPassword(user.getPasswd()));
        user.setEnable(0);
        resultCount = userMapper.insert(user);
        if (resultCount == 0) {
            return ServerResponse.createByErrorMessage("注册失败");
        }
        mailService.registerNotify(user.getEmail());
        return ServerResponse.createBySuccessMessage("注册成功,请前往邮箱激活");
    }


    public String enable(String key) {
//        boolean value = mailService.enable(key);
//        if (value) {
//            return ServerResponse.createBySuccessMessage("激活成功");
//        } else {
//            return ServerResponse.createBySuccessMessage("激活失败");
//        }

        return "dsds";
    }
}

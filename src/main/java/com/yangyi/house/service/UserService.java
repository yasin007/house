package com.yangyi.house.service;

import com.yangyi.house.serverResponse.ServerResponse;
import com.yangyi.house.common.User;
import org.springframework.stereotype.Service;

public interface UserService {


    /**
     * 注册service注册
     *
     * @param user
     * @return
     */
    ServerResponse<String> register(User user);

    String enable(String key);

}


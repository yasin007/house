package com.yangyi.house.mapper;

import com.yangyi.house.common.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    public List<User> selectUsers();

    public int insert(User user);

    public int update(User updateUser);

    public int delete(String email);

    /**
     * 检查用户名是否存在
     *
     * @param name
     * @return
     */
    int checkUsername(String name);


    public List<User> selectUsersByQuery(User user);

}
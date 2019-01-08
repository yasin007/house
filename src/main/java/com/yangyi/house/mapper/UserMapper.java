package com.yangyi.house.mapper;

import com.yangyi.house.common.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    public List<User> selectUsers();

}
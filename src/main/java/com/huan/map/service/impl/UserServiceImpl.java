package com.huan.map.service.impl;


import com.huan.map.Exception.ValidateException;
import com.huan.map.mapper.UserMapper;
import com.huan.map.model.User;
import com.huan.map.service.UserService;
import com.huan.map.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper usermapper;

    @Override
    public User checkUser(String username, String password) {
        if (Objects.isNull(username)){
            throw new ValidateException("username is null");
        }
        if (Objects.isNull(password)){
            throw new ValidateException("password is null");
        }
        User user = usermapper.checkUser(username, MD5Utils.code(password));
        return user;
    }
}

package com.huan.map.service.impl;


import com.huan.map.mapper.UserMapper;
import com.huan.map.model.User;
import com.huan.map.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper usermapper;

    @Override
    public User checkUser(String username, String password) {
        User user = usermapper.checkUser(username, password);
        return user;
    }
}

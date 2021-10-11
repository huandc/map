package com.huan.map.util.validate;

import com.huan.map.Exception.ValidateException;
import com.huan.map.model.User;

import java.util.Objects;

public class UserValidate {

    public static boolean validate(User user) {
        if (Objects.isNull(user)){
            throw new ValidateException("user is null");
        }
        if (Objects.isNull(user.getUsername())){
            throw new ValidateException("username is null");
        }
        if (Objects.isNull(user.getPassword())){
            throw new ValidateException("password is null");
        }
        return true;
    }
}

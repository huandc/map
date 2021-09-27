package com.huan.map.controller;

import com.huan.map.mapper.UserMapper;
import com.huan.map.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;

import javax.annotation.Resource;

/**
 * 用户表
 *
 * @author yan
 * @date 2021/9/26
 */
@Api(tags = "用户表")
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserMapper userMapper;

    @ApiOperation("查询用户信息")
    @PostMapping("/get")
    public Boolean getBaseStationRadiation(@SessionAttribute User user) {
        if (userMapper.listUser(user.getUsername()).size() > 0) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }
}

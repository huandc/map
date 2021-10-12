package com.huan.map.controller;


import com.huan.map.model.User;
import com.huan.map.service.UserService;
import com.huan.map.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin")
@CrossOrigin(value = "*",maxAge = 3600)
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String loginPages(){
        return "admin/login";
    }

    @PostMapping("/login")
    @ResponseBody
    public Boolean login(@RequestBody User user,
                        HttpSession session, RedirectAttributes attributes){
        User usr = userService.checkUser(user.getUsername(), user.getPassword());
        System.out.println(usr);
        if (usr!=null){
            //登录成功
            user.setPassword(null);
            session.setAttribute("user",user);
            return Boolean.TRUE;
        }else {
            attributes.addFlashAttribute("message","用户名或密码错误");
            return Boolean.FALSE;
        }
    }

    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute("user");
        return "redirect:/admin";
    }

    @GetMapping("/sign")
    public String logout(RedirectAttributes attributes){
        attributes.addFlashAttribute("message","你注册不了的啦!为什么不选择直接浏览呢");
        return "redirect:/admin";
    }


}

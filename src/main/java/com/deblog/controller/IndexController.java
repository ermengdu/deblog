package com.deblog.controller;

import com.deblog.entity.User;
import com.deblog.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Dem
 * @Email：2669498105@qq.com
 * @Date: 2022/7/21 23:20
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    private IUserService userService;

    @GetMapping("/")
    public String index(){
        for (User user : userService.list()) {
            System.out.println(user.getUserName());
        }
        return "index";
    }
}

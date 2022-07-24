package com.deblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Dem
 * @Email：2669498105@qq.com
 * @Date: 2022/7/23 18:15
 */
@Controller
@RequestMapping("/deblog")
public class AdminController {

    @GetMapping("/")
    public String adminIndex(){
        return "/admin/index";
    }
}

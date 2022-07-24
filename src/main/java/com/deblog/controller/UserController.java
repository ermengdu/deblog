package com.deblog.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.deblog.dto.user.UserListPageDto;
import com.deblog.entity.Comment;
import com.deblog.entity.User;
import com.deblog.service.IUserService;
import com.deblog.utils.CommonPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Dem
 * @Email：2669498105@qq.com
 * @Date: 2022/7/24 23:40
 */
@Controller
@RequestMapping("/user")
public class UserController {

}

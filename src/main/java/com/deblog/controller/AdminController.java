package com.deblog.controller;

import cn.hutool.system.HostInfo;
import cn.hutool.system.OsInfo;
import cn.hutool.system.SystemUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.deblog.dto.user.UserListPageDto;
import com.deblog.entity.User;
import com.deblog.service.IArticleService;
import com.deblog.service.IArticleTagService;
import com.deblog.service.IArticleTypeService;
import com.deblog.service.IUserService;
import com.deblog.utils.CommonPage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Dem
 * @Email：2669498105@qq.com
 * @Date: 2022/7/23 18:15
 */
@Controller
@RequestMapping("/deblog")
@Slf4j
public class AdminController {

    @Autowired
    private IArticleService articleService;

    @Autowired
    private IArticleTagService articleTagService;

    @Autowired
    private IArticleTypeService articleTypeService;

    @Autowired
    private IUserService userService;


    @GetMapping("/")
    public String adminIndex(Model model){
        // 系统信息
        OsInfo osInfo = SystemUtil.getOsInfo();
        HostInfo hostInfo = SystemUtil.getHostInfo();
        model.addAttribute("osName",osInfo.getName());
        model.addAttribute("hostAddress",hostInfo.getAddress());

        // 文章数量
        int articleCount = articleService.count();
        int articleTypeCount = articleTypeService.count();
        int articleTagCount = articleTagService.count();
        model.addAttribute("articleCount",articleCount);
        model.addAttribute("articleTypeCount",articleTypeCount);
        model.addAttribute("articleTagCount",articleTagCount);

        // 用户数量
        int userCount = userService.count();
        model.addAttribute("userCount",userCount);

        return "/admin/index";
    }

    /**
     * 管理端-用户列表
     * @param userListPageDto
     * @param model
     * @return
     */
    @GetMapping("/user/list")
    public String userList(UserListPageDto userListPageDto, Model model){
        Integer pageNumber = userListPageDto.getPageNumber();
        Integer pageSize = userListPageDto.getPageSize();
        IPage<User> userPage = new Page<>(pageNumber,pageSize);
        // 对用户按照注册时间进行排序
        LambdaQueryWrapper<User> userLambdaQueryWrapper = Wrappers.<User>lambdaQuery().orderByDesc(User::getUserRegisterTime);
        IPage<User> userIPage = userService.page(userPage, userLambdaQueryWrapper);
        model.addAttribute("userPage", CommonPage.restPage(userIPage));
        return "/admin/userList";
    }


}

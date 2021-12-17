package com.chris.webadmin.controller;


import com.chris.webadmin.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

/**
 * @ author: chris
 * @ creat: 2021-11-11 23:09
 * @ description:
 */
@Controller
public class IndexController {
    /**
     * 登录页
     * @return
     */
    @GetMapping(value = {"/", "/login"})
    public String loginPage(){
        return "login";
    }

    @PostMapping("/login")
    public String main(User user, HttpSession session, Model model){
        if(StringUtils.hasLength(user.getUserName()) && "123456".equals(user.getPassWord())){
            //把登录成功的用户保存起来
            session.setAttribute("loginUser", user);
            //登录成功重定向到main.html
            return "redirect:/main.html";
        }else{
            model.addAttribute("msg", "账号密码错误！");
            // 回到登录页面
            return "/login";
        }

    }

    /**
     * 去main页面
     * @return
     */
    @GetMapping("/main.html")
    public String mainPage(HttpSession session, Model model){
        //是否登录 拦截器 过滤器
//        Object loginUser = session.getAttribute("loginUser");
//        if(loginUser != null){
//            return "main";
//        }else {
//            model.addAttribute("msg", "请重新登录！");
//            // 回到登录页面
//            return "/login";
//        }
        return "main";

    }
}

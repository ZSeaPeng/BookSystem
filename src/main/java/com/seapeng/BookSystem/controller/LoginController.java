package com.seapeng.BookSystem.controller;

import com.seapeng.BookSystem.model.TUser;
import com.seapeng.BookSystem.service.ILoginService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by zseapeng on 2016/9/1.
 */
@Controller
public class LoginController {
    @Resource()
    private ILoginService iLoginService;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String login(@ModelAttribute TUser user){
        return "index";
    }

    @RequestMapping(value = "/",method = RequestMethod.POST)
    public String login(TUser user, Model model, HttpSession session){
        TUser usertmp = iLoginService.selectByUsername(user);
        if (usertmp==null){
            System.out.println("用户不存在");
            return "index";
        }
        if (!usertmp.getUserPassword().equals(user.getUserPassword())){
            System.out.println("密码错误");
            return "index";
        }
        session.setAttribute("loginUser",usertmp);
        return "redirect:web/sale";
    }
}

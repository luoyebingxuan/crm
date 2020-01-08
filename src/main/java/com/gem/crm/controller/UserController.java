package com.gem.crm.controller;

import com.gem.crm.entity.User;
import com.gem.crm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

//相当于@Controller + @ResponseBody
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/user")
    public String login(HttpSession session, User user) {
        User u = userService.login(user);
        if (u == null) {
            return "0";
        }
        session.setAttribute("user", user);
        return "1";
    }
}

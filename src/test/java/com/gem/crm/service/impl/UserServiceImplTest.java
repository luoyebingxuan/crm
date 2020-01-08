package com.gem.crm.service.impl;

import com.gem.crm.BaseTest;
import com.gem.crm.entity.User;
import org.junit.Test;

public class UserServiceImplTest extends BaseTest {

    @Test
    public void register() {
        User user = new User();
        user.setUsername("Lilei");
        user.setPassword("123456");
        userService.register(user);
    }

    @Test
    public void login() {
        User user = new User();
        user.setUsername("Lilei");
        user.setPassword("123456");
        User u = userService.login(user);
        System.out.println(u);
    }
}
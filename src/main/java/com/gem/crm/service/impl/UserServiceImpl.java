package com.gem.crm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gem.crm.entity.User;
import com.gem.crm.mapper.UserMapper;
import com.gem.crm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public void register(User user) {
        userMapper.insert(user);
    }

    @Override
    public User login(User user) {
        QueryWrapper<User> qw = new QueryWrapper<>();
        qw.eq("username", user.getUsername()).eq("password", user.getPassword());

        //lambda
        //qw.lambda().eq(User::getUsername, user.getUsername()).eq(User::getPassword, user.getPassword());
        return userMapper.selectOne(qw);
    }
}

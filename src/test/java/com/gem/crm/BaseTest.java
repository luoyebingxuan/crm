package com.gem.crm;

import com.gem.crm.mapper.CustomerMapper;
import com.gem.crm.mapper.UserMapper;
import com.gem.crm.service.CustomerService;
import com.gem.crm.service.UserService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BaseTest {

    @Autowired
    public UserMapper userMapper;

    @Autowired
    public UserService userService;

    @Autowired
    public CustomerMapper customerMapper;

    @Autowired
    public CustomerService customerService;
}

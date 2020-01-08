package com.gem.crm.service.impl;

import com.gem.crm.BaseTest;
import com.gem.crm.service.CustomerService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerServiceImplTest extends BaseTest {

    @Autowired
    CustomerService customerService;

    @Test
    public void list() {
        customerService.list().forEach(System.out::println);
    }

    @Test
    public void findById() {
    }

    @Test
    public void search() {
    }

    @Test
    public void edit() {
    }

    @Test
    public void remove() {
    }

    @Test
    public void listByPage() {
        customerService.listByPage(1,3,null).getRecords().forEach(System.out::println);
    }
}
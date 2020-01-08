package com.gem.crm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gem.crm.entity.Customer;
import com.gem.crm.mapper.CustomerMapper;
import com.gem.crm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerMapper customerMapper;

    @Override
    public List<Customer> list() {
        return customerMapper.selectList(null);
    }

    @Override
    public Customer findById(Long id) {
        return customerMapper.selectById(id);
    }

    @Override
    public List<Customer> search(String name) {
        QueryWrapper<Customer> qw = new QueryWrapper<>();
        qw.lambda().like(Customer::getName, name);
        return customerMapper.selectList(qw);
    }

    @Override
    public void edit(Customer customer) {
        customerMapper.insert(customer);

    }

    @Override
    public void remove(Long id) {
        customerMapper.deleteById(id);
    }

    @Override
    public IPage<Customer> listByPage(int currentPage, int pageSize, String name) {
        IPage<Customer> page = null;
        if (name != null) {
            page = customerMapper.selectPage(new Page<>(currentPage, pageSize), new QueryWrapper<Customer>().like("name", name));
        } else {
            page = customerMapper.selectPage(new Page<>(currentPage, pageSize), null);
        }
        return page;
    }
}

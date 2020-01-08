package com.gem.crm.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.gem.crm.entity.Customer;

import java.util.List;

public interface CustomerService {
    /**
     * 查询所有顾客
     */
    List<Customer> list();

    /**
     * 分页显示顾客
     */
    IPage<Customer> listByPage(int currentPage, int pageSize, String name);

    /**
     * 根据id查询顾客
     */
    Customer findById(Long id);

    /**
     * 根据顾客姓名模糊查询顾客
     */
    List<Customer> search(String name);

    /**
     * 添加更新顾客信息
     */
    void edit(Customer customer);

    /**
     * 删除顾客信息
     */
    void remove(Long id);
}

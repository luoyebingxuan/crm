package com.gem.crm.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.gem.crm.entity.Customer;
import com.gem.crm.entity.User;
import com.gem.crm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping("/test")
    @ResponseBody
    public List list2(Model model) {
        ArrayList l1 = new ArrayList();
        User u1 = new User(1L , "jack" , "12345");
        l1.add(u1);
        return l1;
    }

    @GetMapping("/getCustomers")
    public String list(Model model) {
        IPage<Customer> page = customerService.listByPage(1, 3, null);
        model.addAttribute("page", page);
        return "customer/data";
    }

    @DeleteMapping("/customer/{id}")
    @ResponseBody
    public String delete(@PathVariable("id") Long id) {
       try {
            customerService.remove(id);
            return "0";
        } catch (Exception e) {
            return "1";
        }
    }
}

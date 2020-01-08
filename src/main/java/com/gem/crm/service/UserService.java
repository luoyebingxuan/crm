package com.gem.crm.service;

import com.gem.crm.entity.User;

/**业务层接口*/
public interface UserService  {

    /**
     * 注册
     */
    void register(User user);

    /**
     * 登录
     */
    User login(User user);
}

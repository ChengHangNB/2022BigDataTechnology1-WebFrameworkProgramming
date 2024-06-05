package com.example.demo.mapper;

import com.example.demo.model.Account;
import com.example.demo.model.Role;

import java.util.List;

public interface AccountMapper {
    // 通过用户名获取账户信息
    Account getAccountByUsername(String username);
    // 通过用户id获取账户角色信息
    List<Role> getAccountRoleById(Integer id);
}


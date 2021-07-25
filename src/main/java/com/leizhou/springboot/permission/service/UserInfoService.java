package com.leizhou.springboot.permission.service;

import com.leizhou.springboot.permission.bean.UserInfo;

public interface UserInfoService {
    public UserInfo findByUserName(String username);
}

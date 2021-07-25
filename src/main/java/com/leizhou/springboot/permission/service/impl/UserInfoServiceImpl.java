package com.leizhou.springboot.permission.service.impl;

import com.leizhou.springboot.permission.bean.UserInfo;
import com.leizhou.springboot.permission.repository.UserInfoRepository;
import com.leizhou.springboot.permission.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoRepository userInfoRepository;

    @Override
    public UserInfo findByUserName(String username) {
        return userInfoRepository.findByUserName(username);
    }
}

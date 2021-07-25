package com.leizhou.springboot.permission.init;

import com.leizhou.springboot.permission.bean.UserInfo;
import com.leizhou.springboot.permission.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class DataInit {
    @Autowired
    private UserInfoRepository userInfoRepository;

    @PostConstruct
    public void initData(){
        UserInfo admin = new UserInfo();
        admin.setUserName("leizhou");
        admin.setPassword("123456");
        admin.setRole(UserInfo.Role.admin);
        userInfoRepository.save(admin);

        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("zhaohuihe");
        userInfo.setPassword("123456");
        userInfo.setRole(UserInfo.Role.normal);
        userInfoRepository.save(userInfo);
    }
}

package com.leizhou.springboot.permission.repository;

import com.leizhou.springboot.permission.bean.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {
    public UserInfo findByUserName(String username);
}

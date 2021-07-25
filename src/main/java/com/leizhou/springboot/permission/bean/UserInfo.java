package com.leizhou.springboot.permission.bean;

import javax.persistence.*;

@Entity
public class UserInfo {
    @Id @GeneratedValue
    private long id;

    private String userName;

    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String username) {
        this.userName = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public enum Role{
        admin,
        normal,
    }

    public  UserInfo(){}

    public UserInfo(long id, String username, String password, Role role) {
        this.id = id;
        this.userName = username;
        this.password = password;
        this.role = role;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", username='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                '}';
    }
}

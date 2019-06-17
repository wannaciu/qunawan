package com.springboot.qunawan.service;

import com.springboot.qunawan.pojo.User;

public interface UserService {
    public User findUserById(int userid);
    public Boolean login(User user);
}

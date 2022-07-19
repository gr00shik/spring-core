package com.tms.service;

import com.tms.model.User;

public interface UserService {
    void save(User user);
    boolean isAth(String username, String password);
    void logout(String username);
}

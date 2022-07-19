package com.tms.service;

import com.tms.model.User;

public interface LoginService {

    void save(User user);
    boolean isAuth(String username, String password);
    void logout(String username);

}

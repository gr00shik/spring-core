package com.tms.service;

import com.tms.model.User;

public class LoginServiceImpl implements LoginService {

    private UserService service;

    public LoginServiceImpl(UserService service) {
        System.out.println("login service constructor");
        this.service = service;
    }

    @Override
    public void save(User user) {
        service.save(user);
    }

    public void init() {
        System.out.println("hello from init");
    }

    @Override
    public boolean isAuth(String username, String password) {
        return false;
    }

    @Override
    public void logout(String username) {

    }

    public void destroy() {
        System.out.println("hello from destroy");
    }
}

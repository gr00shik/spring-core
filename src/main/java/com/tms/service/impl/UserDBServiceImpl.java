package com.tms.service;

import com.tms.model.Database;
import com.tms.model.User;

public class UserDBServiceImpl implements UserService {

    private Database store;

//    public UserDBServiceImpl() {
//    }

    public UserDBServiceImpl(Database store) {
        this.store = store;
    }

    @Override
    public void save(User user) {
        store.add(user);
    }

    @Override
    public boolean isAth(String username, String password) {
        return false;
    }

    @Override
    public void logout(String username) {

    }
}

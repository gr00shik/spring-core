package com.tms.service;

import com.tms.model.Database;
import com.tms.model.User;

public class UserFileServiceImpl implements UserService {

    private Database database;

    public UserFileServiceImpl(Database database) {
        System.out.println("create user file service");
        this.database = database;
    }

    @Override
    public void save(User user) {
        System.out.println("using file storage");
        database.add(user);
    }

    @Override
    public boolean isAth(String username, String password) {
        return false;
    }

    @Override
    public void logout(String username) {

    }
}

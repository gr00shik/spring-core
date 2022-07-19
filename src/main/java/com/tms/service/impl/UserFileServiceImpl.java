package com.tms.service.impl;

import com.tms.model.Database;
import com.tms.model.User;
import com.tms.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Qualifier("userFileService")
@Primary
public class UserFileServiceImpl implements UserService {

    private Database database;

    public void init() {
        System.out.println("----------init---------");
    }

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

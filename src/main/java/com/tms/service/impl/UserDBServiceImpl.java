package com.tms.service.impl;

import com.tms.model.Database;
import com.tms.model.User;
import com.tms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Qualifier("userService")
public class UserDBServiceImpl implements UserService {

    @Autowired
    private Database store;

    @Autowired
    ApplicationContext context;

    public UserDBServiceImpl() {
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

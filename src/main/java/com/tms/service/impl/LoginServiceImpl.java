package com.tms.service.impl;

import com.tms.lazy.NullService;
import com.tms.model.Database;
import com.tms.model.User;
import com.tms.service.LoginService;
import com.tms.service.UserService;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
import java.util.Map;

@Service
public class LoginServiceImpl implements LoginService, InitializingBean, DisposableBean, BeanNameAware {

//    @Autowired
    UserService service;

    @Autowired
    private ObjectFactory<Database> databases;

    @Autowired
    public LoginServiceImpl(@Autowired(required = false) NullService nullService) {
        service = new UserDBServiceImpl();
        this.service = service;
        System.out.println("login service constructor");
    }

    public LoginServiceImpl(Database database) {
        System.out.println("");
    }

    @Override
    public void save(User user) {
//        service.save(user);
        Database database = databases.getObject();
        System.out.println(database.getUsers());
    }

    @PostConstruct
    public void init() {
        System.out.println("---------hello from init post construct---------");
    }

    public void init1() {
        System.out.println("---------hello from init config ---------");
    }

    @Autowired
    public void print(Database database) {
        database.getUsers().forEach(user -> System.out.println(" " + user));
    }

    @Override
    public boolean isAuth(String username, String password) {
        return false;
    }

    @Override
    public void logout(String username) {

    }

    @PreDestroy
    public void destroyPreDestroy() {
        System.out.println("-------hello from destroy PreDestroy-------");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("---------hello from init afterPropertiesSet---------");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("-------hello from destroy DisposableBean-------");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("------set bean name ---------");
    }
}

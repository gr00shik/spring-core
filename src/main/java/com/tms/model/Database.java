package com.tms.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope(scopeName = "prototype")
public class Database {

    @PostConstruct
    public void init() {
        System.out.println("-------init db ----------");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("-------destroy db ----------");
    }

    private List<User> users = new ArrayList<>();

    public void add(User user) {
        boolean alreadyExist = users.stream()
                .anyMatch(us -> us.getUsername().equals(user.getUsername()));
        if (alreadyExist) {
            System.out.printf("user with name %s is exist", user.getUsername());
            throw new IllegalArgumentException();
        }
        users.add(user);
        System.out.printf("user %s was added to database%n", user.getUsername());
    }

    public List<User> getUsers() {
        return users;
    }


}

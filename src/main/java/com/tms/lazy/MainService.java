package com.tms.lazy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class MainService {

    @Autowired
    @Lazy
    LazyService service;

    @Value("ffsdfsdfsdf")
    private String text;

    public MainService() {
        System.out.println("main service");
    }

    @PostConstruct
    public void init() {
        System.out.println(service.toString());
    }
}

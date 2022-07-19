package com.tms;

import com.tms.model.User;
import com.tms.service.LoginService;
import com.tms.service.impl.BeanService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MainApp {

    public static void main(String ... args) {

        User user1 = new User("user1", "pass1", 20, true);
        User user2 = new User("user2", "pass2", 25, false);
        User user3 = new User("user3", "pass3", 30, true);

        AbstractApplicationContext context = new AnnotationConfigApplicationContext("com.tms");
        context.registerShutdownHook();

//        BeanService beanService = context.getBean(BeanService.class);

        LoginService loginService = context.getBean(LoginService.class);
        System.out.println("--------------------------------");
        loginService.save(user1);
        System.out.println("--------------------------------");
        loginService.save(user2);
        System.out.println("--------------------------------");
        loginService.save(user3);
//
//        loginService.save(user1);
//        loginService.save(user2);
//        loginService.save(user3);

    }

}

package com.tms.config;

import com.tms.model.Database;
import com.tms.service.LoginService;
import com.tms.service.UserService;
import com.tms.service.impl.LoginServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class SpringSecondConfig {

//    @Bean(initMethod = "init1")
//    public LoginService loginService(UserService service) {
////        LoginService loginService = new LoginServiceImpl(service);
//        return loginService;
//    }

//    @Bean
    public Database database() {
        return new Database();
    }

}

package com.tms.config;

import com.tms.model.Database;
import com.tms.service.LoginService;
import com.tms.service.UserService;
import com.tms.service.impl.LoginServiceImpl;
import com.tms.service.impl.UserDBServiceImpl;
import com.tms.service.impl.UserFileServiceImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//@Configuration
public class SpringConfig {

//    @Bean
//    @Primary
//    public UserService userService(Database database) {
////        return new UserDBServiceImpl(database);
//    }

    @Bean
    public UserService userFileService(Database db) {
        UserService userService = new UserFileServiceImpl(db);
        return userService;
    }


}

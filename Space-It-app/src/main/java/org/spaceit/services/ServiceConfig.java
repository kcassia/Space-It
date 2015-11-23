package org.spaceit.services;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by gkstn_000 on 2015-11-23.
 */
@Configuration
public class ServiceConfig {

    @Bean
    UserService userService(){
        return new UserServiceImpl();
    }

}

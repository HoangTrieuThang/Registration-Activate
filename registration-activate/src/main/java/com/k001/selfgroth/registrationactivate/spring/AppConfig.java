package com.k001.selfgroth.registrationactivate.spring;

import com.k001.selfgroth.registrationactivate.security.ActiveUserStore;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    // beans

    @Bean
    public ActiveUserStore activeUserStore() {
        return new ActiveUserStore();
    }

}
package com.example.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by vi.tt on 30/10/2017.
 */
public class WebMvcConfig extends WebMvcConfigurerAdapter {
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        BCryptPasswordEncoder bCryptPasswordEncoder  = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder;
    }
}

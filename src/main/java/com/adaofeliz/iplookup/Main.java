package com.adaofeliz.iplookup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created on 19/11/14.
 */

@EnableWebMvc
@EnableAutoConfiguration
public class Main {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Main.class, args);
    }

}

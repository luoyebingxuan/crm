package com.gem.crm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class CrmApplication implements WebMvcConfigurer {
    public static void main(String[] args) {
        SpringApplication.run(CrmApplication.class, args);



    }
}

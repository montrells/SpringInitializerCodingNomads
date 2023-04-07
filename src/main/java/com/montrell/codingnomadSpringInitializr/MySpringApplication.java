package com.montrell.codingnomadSpringInitializr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MySpringApplication{
    public static void main(String[] args) {
        SpringApplication.run(MySpringApplication.class, args);
    }
}

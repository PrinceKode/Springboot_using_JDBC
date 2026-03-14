package com.prince;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJdbcDemo1Application {

    public static void main(String[] args) {
        System.out.println("SpringBoot-JDBC - START ---");
        SpringApplication.run(SpringBootJdbcDemo1Application.class, args);
        System.out.println("SpringBoot-JDBC-END-----");
    }

}
package com.deblog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.deblog.mapper")
public class DeblogApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeblogApplication.class, args);
    }

}

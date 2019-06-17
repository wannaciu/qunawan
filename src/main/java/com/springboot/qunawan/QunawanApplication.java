package com.springboot.qunawan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.springboot")
public class QunawanApplication {

    public static void main(String[] args) {
        SpringApplication.run(QunawanApplication.class, args);
    }

}

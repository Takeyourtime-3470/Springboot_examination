package com.bdqn.kgc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.bdqn.kgc.mapper")
public class MbexpApplication {

    public static void main(String[] args) {
        SpringApplication.run(MbexpApplication.class, args);
    }

}

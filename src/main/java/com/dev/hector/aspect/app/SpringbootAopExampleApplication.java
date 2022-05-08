package com.dev.hector.aspect.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SpringbootAopExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootAopExampleApplication.class, args);
    }

}

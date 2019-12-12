package com.mrliuli.consuldemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class ConsulDemoConsumerApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(ConsulDemoConsumerApplication.class, args);
        System.out.println(applicationContext.getEnvironment().getProperty("secretKey"));
    }

}

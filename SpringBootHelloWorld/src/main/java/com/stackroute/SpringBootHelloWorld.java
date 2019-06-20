package com.stackroute;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootHelloWorld {
    public static void main(String[] args) {

        /*SpringApplication.run(
                new Object[] { SpringBootHelloWorld.class }, args);*/
        SpringApplication.run(SpringBootHelloWorld.class, args);
    }
}

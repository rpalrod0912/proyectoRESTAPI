package com.example.proyectorestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude ={ SecurityAutoConfiguration.class } )
public class ProyectoRestapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProyectoRestapiApplication.class, args);
    }

}

package aua.dbproject.service.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by hrachyayeghishyan on 11/16/17.
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("aua.dbproject")
public class Application {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}


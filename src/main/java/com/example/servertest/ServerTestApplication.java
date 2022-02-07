package com.example.servertest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServerTestApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ServerTestApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(Lookup lookup){
        return args -> {

            String c = lookup.getData();
            System.out.println("======== " + c);

        };
    }

    @Override
    public void run(String... args) throws Exception {

    }
}

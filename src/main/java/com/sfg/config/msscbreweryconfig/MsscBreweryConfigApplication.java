package com.sfg.config.msscbreweryconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class MsscBreweryConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsscBreweryConfigApplication.class, args);
    }

}

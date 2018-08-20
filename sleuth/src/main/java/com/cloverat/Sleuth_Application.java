package com.cloverat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

/**
 * @author cloverat
 * @date 2018-8-20
 */
@SpringBootApplication
@EnableZipkinServer
public class Sleuth_Application {

    public static void main(String[] args) {
        SpringApplication.run(Sleuth_Application.class, args);
    }
}

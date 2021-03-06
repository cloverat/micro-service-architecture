package com.cloverat;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author cloverat
 * @date 2018-8-20
 */
@EnableDiscoveryClient
@SpringBootApplication
public class B2_Application {

    public static void main(String[] args) {
        new SpringApplicationBuilder(B2_Application.class).web(true).run(args);
    }
}

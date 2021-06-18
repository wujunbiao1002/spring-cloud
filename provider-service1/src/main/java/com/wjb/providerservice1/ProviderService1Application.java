package com.wjb.providerservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author WJB
 */
@SpringBootApplication
@EnableEurekaClient
public class ProviderService1Application {

    public static void main(String[] args) {
        SpringApplication.run(ProviderService1Application.class, args);
    }

}

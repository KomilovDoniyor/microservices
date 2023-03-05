/**
 * Author: komiloff_doniyor2505@gmail.com
 * Date:11/19/2022
 * Time:4:37 PM
 * Project Name:microservices
 */
package com.mycompany.fraud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FraudApplication {
    public static void main(String[] args) {
        SpringApplication.run(FraudApplication.class, args);
    }
}

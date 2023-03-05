/**
 * Author: komiloff_doniyor2505@gmail.com
 * Date:11/19/2022
 * Time:3:27 PM
 * Project Name:microservices
 */
package com.mycompany.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CustomerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class, args);
    }
}

/**
 * Author: komiloff_doniyor2505@gmail.com
 * Date:11/19/2022
 * Time:10:40 PM
 * Project Name:microservices
 */
package com.mycompany.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}

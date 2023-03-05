/**
 * Author: komiloff_doniyor2505@gmail.com
 * Date:11/19/2022
 * Time:5:17 PM
 * Project Name:microservices
 */
package com.mycompany.customer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CustomerConfig {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}

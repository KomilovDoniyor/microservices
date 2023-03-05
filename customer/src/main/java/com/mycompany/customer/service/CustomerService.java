/**
 * Author: komiloff_doniyor2505@gmail.com
 * Date:11/19/2022
 * Time:3:35 PM
 * Project Name:microservices
 */
package com.mycompany.customer.service;

import com.mycompany.customer.dto.CustomerRequest;
import com.mycompany.customer.dto.FraudCheckResponse;
import com.mycompany.customer.entity.Customer;
import com.mycompany.customer.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final RestTemplate restTemplate;

    public void registration(CustomerRequest request) {
        Customer customer = Customer.builder()
                .firstname(request.getFirstname())
                .lastname(request.getLastname())
                .email(request.getEmail())
                .build();
        customerRepository.saveAndFlush(customer);
        FraudCheckResponse fraudCheckResponse = restTemplate.getForObject(
                "http://FRAUD/api/v1/frauds/{customerId}",
                FraudCheckResponse.class,
                customer.getId());

        if (fraudCheckResponse.getIsFraudster()){
            throw new IllegalStateException("Fraud");
        }


    }
}

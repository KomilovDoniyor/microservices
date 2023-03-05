/**
 * Author: komiloff_doniyor2505@gmail.com
 * Date:11/19/2022
 * Time:3:34 PM
 * Project Name:microservices
 */
package com.mycompany.customer.controller;

import com.mycompany.customer.dto.CustomerRequest;
import com.mycompany.customer.service.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/customers")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @PostMapping
    public void registrationCustomer(@RequestBody CustomerRequest request){
        log.info("Registration Customer {}", request);
        customerService.registration(request);
    }
}

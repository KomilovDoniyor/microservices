/**
 * Author: komiloff_doniyor2505@gmail.com
 * Date:11/19/2022
 * Time:4:59 PM
 * Project Name:microservices
 */
package com.mycompany.fraud.controller;


import com.mycompany.fraud.dto.FraudCheckResponse;
import com.mycompany.fraud.service.FraudCheckService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/frauds")
@RequiredArgsConstructor
public class FraudCheckController {
    private final FraudCheckService fraudCheckService;

    @GetMapping("/{customerId}")
    public FraudCheckResponse isFraudster(@PathVariable("customerId") Integer customerId){
        boolean isFraudulentCustomer = fraudCheckService.isFraudulentCustomer(customerId);
        return new FraudCheckResponse(isFraudulentCustomer);
    }
}

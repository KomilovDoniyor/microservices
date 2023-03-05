/**
 * Author: komiloff_doniyor2505@gmail.com
 * Date:11/19/2022
 * Time:5:01 PM
 * Project Name:microservices
 */
package com.mycompany.fraud.service;

import com.mycompany.fraud.entity.FraudCheckHistory;
import com.mycompany.fraud.repository.FraudCheckRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class FraudCheckService {
    private final FraudCheckRepository fraudCheckRepository;

    public boolean isFraudulentCustomer(Integer customerId) {
        FraudCheckHistory fraudCheckHistory = fraudCheckRepository.save(
                FraudCheckHistory.builder()
                        .customerId(customerId)
                        .isFraudster(false)
                        .createdAt(LocalDateTime.now())
                        .build()
        );
        fraudCheckRepository.save(fraudCheckHistory);
        return false;
    }
}

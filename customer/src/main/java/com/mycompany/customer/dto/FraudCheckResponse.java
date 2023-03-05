/**
 * Author: komiloff_doniyor2505@gmail.com
 * Date:11/19/2022
 * Time:5:06 PM
 * Project Name:microservices
 */
package com.mycompany.customer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FraudCheckResponse {
    private Boolean isFraudster;
}

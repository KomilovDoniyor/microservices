/**
 * Author: komiloff_doniyor2505@gmail.com
 * Date:11/19/2022
 * Time:3:38 PM
 * Project Name:microservices
 */
package com.mycompany.customer.dto;

import lombok.Data;

@Data
public class CustomerRequest {
    private String firstname;
    private String lastname;
    private String email;
}

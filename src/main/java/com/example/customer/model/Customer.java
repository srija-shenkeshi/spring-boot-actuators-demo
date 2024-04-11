package com.example.customer.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder
@Data
@AllArgsConstructor
@Document
public class Customer {
    String customerId;
    String firstName;
    String lastName;
    String customerType;
    String customerEmail;
    String customerPhone;
}

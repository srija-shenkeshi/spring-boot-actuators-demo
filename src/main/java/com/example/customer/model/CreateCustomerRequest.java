package com.example.customer.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateCustomerRequest {
    @NotBlank
    String firstName;
    @NotBlank
    String lastName;
    String customerType;
    @NotBlank
    @Email(message = "Please provide a valid email address")
    String customerEmail;
    String customerPhone;
}

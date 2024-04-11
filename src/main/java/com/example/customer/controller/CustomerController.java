package com.example.customer.controller;

import com.example.customer.model.CreateCustomerRequest;
import com.example.customer.model.Customer;
import com.example.customer.service.CustomerService;;
import jakarta.validation.Valid;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @SneakyThrows
    @PostMapping(path = "/createCustomer")
    public ResponseEntity<Customer> createCustomer(@Valid @RequestBody CreateCustomerRequest createCustomerRequest) {
        log.info("Received request to create customer: {}", createCustomerRequest);
        Customer customer = customerService.createCustomer(createCustomerRequest);
        return new ResponseEntity<>(customer, new HttpHeaders(), HttpStatus.CREATED);
    }

    @SneakyThrows
    @GetMapping(path = "/getCustomers")
    public ResponseEntity<List<Customer>> retrieveCustomers() {
        List<Customer> customers = customerService.retrieveCustomers();
        return new ResponseEntity<>(customers, new HttpHeaders(), HttpStatus.OK);
    }
}

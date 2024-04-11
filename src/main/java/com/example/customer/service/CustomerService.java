package com.example.customer.service;

import com.example.customer.model.CreateCustomerRequest;
import com.example.customer.model.Customer;
import com.example.customer.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Slf4j
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public Customer createCustomer(CreateCustomerRequest createCustomerRequest) {

        String customerId = UUID.randomUUID().toString();

        //build customer object based on the createCustomerRequest
        Customer customer = new Customer(customerId,createCustomerRequest.getFirstName(), createCustomerRequest.getLastName(), createCustomerRequest.getCustomerType(),
                createCustomerRequest.getCustomerEmail(), createCustomerRequest.getCustomerPhone());

        // save the Customer object to database
        Customer savedCustomer = customerRepository.insert(customer);
        log.info("Saved Customer Details: {}", savedCustomer);
        return savedCustomer;
    }

    public List<Customer> retrieveCustomers() {

        return customerRepository.findAll();
    }
}

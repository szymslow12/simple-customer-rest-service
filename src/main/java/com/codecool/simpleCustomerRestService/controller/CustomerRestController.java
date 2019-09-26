package com.codecool.simpleCustomerRestService.controller;

import com.codecool.simpleCustomerRestService.domain.Customer;
import com.codecool.simpleCustomerRestService.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRestController {

    private CustomerService customerService;

    @Autowired
    public CustomerRestController(CustomerService customerService) {
        this.customerService = customerService;
    }


    @PostMapping(value = "api/customers", produces = "application/json")
    public Customer createCustomer(Customer customer) {
        return customerService.add(customer);
    }


    @GetMapping(value = "api/customers/{id}", produces = "application/json")
    public Customer getCustomer(@PathVariable("id") Long customerId) {
        return customerService.get(customerId);
    }

}

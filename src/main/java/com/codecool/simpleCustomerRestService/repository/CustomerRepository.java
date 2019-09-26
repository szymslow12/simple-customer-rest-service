package com.codecool.simpleCustomerRestService.repository;

import com.codecool.simpleCustomerRestService.domain.Customer;

import java.util.HashMap;
import java.util.Map;

public class CustomerRepository {

    private static final Map<Long, Customer> data = new HashMap<>();

    public Customer add(Customer customer) {
        customer.setId(Customer.getSequence());
        return data.put(customer.getId(), customer);
    }


    public Customer get(Long id) {
        return data.get(id);
    }
}

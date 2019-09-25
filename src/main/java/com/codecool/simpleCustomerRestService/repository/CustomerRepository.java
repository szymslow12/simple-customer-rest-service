package com.codecool.simpleCustomerRestService.repository;

import com.codecool.simpleCustomerRestService.domain.Customer;

import java.util.HashMap;
import java.util.Map;

public class CustomerRepository {

    private static Long idSequence;
    private static final Map<Long, Customer> data = new HashMap<>();

    public Customer add(Customer customer) {
        if (customer == null) {
            throw new IllegalArgumentException("Customer cannot be null!");
        }
        customer.setId(idSequence);
        data.put(idSequence++, customer);
        return customer;
    }


    public Customer get(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("ID cannot be null!");
        }
        return data.get(id);
    }
}

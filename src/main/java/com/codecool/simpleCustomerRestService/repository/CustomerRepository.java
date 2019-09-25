package com.codecool.simpleCustomerRestService.repository;

import com.codecool.simpleCustomerRestService.domain.Customer;

import java.util.HashMap;
import java.util.Map;

public class CustomerRepository {

    private static Long idSequence;
    private static final Map<Long, Customer> data = new HashMap<>();

    public Customer add(Customer customer) {
        customer.setId(idSequence);
        data.put(idSequence++, customer);
        return customer;
    }


    public Customer get(Long id) {
        return data.get(id);
    }
}

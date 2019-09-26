package com.codecool.simpleCustomerRestService.service;

import com.codecool.simpleCustomerRestService.domain.Customer;
import com.codecool.simpleCustomerRestService.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;
    private AddressService addressService;

    @Autowired
    public CustomerService(CustomerRepository customerRepository, AddressService addressService) {
        this.customerRepository = customerRepository;
        this.addressService = addressService;
    }


    public Customer add(Customer customer) {
        if (customer == null) {
            throw new IllegalArgumentException("Customer cannot be null!");
        }
        addressService.add(customer.getAddress());
        return customerRepository.add(customer);
    }


    public Customer get(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("ID cannot be null!");
        }
        return customerRepository.get(id);
    }
}

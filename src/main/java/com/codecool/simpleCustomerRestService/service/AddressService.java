package com.codecool.simpleCustomerRestService.service;

import com.codecool.simpleCustomerRestService.domain.Address;
import com.codecool.simpleCustomerRestService.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AddressService {

    private AddressRepository repository;

    @Autowired
    public AddressService(AddressRepository repository) {
        this.repository = repository;
    }


    public Address add(Address address) {
        if (address == null) {
            throw new IllegalArgumentException("Address cannot be null!");
        }
        return repository.add(address);
    }


    public Address get(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("ID cannot be null!");
        }
        return repository.get(id);
    }
}

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
        return repository.add(address);
    }


    public Address get(Long id) {
        return repository.get(id);
    }
}

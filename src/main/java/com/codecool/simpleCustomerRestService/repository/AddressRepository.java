package com.codecool.simpleCustomerRestService.repository;

import com.codecool.simpleCustomerRestService.domain.Address;

import java.util.HashMap;
import java.util.Map;

public class AddressRepository {

    private static final Map<Long, Address> data = new HashMap<>();

    public Address add(Address address) {
        address.setId(Address.getSequence());
        return data.put(address.getId(), address);
    }


    public Address get(Long id) {
        return data.get(id);
    }
}

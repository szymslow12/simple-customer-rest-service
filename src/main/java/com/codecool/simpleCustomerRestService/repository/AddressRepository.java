package com.codecool.simpleCustomerRestService.repository;

import com.codecool.simpleCustomerRestService.domain.Address;

import java.util.HashMap;
import java.util.Map;

public class AddressRepository {

    private static Long idSequence = 0L;
    private static final Map<Long, Address> data = new HashMap<>();

    public Address add(Address address) {
        if (address == null) {
            throw new IllegalArgumentException("Address cannot be null!");
        }
        address.setId(idSequence);
        data.put(idSequence++, address);
        return address;
    }


    public Address get(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("ID cannot be null!");
        }
        return data.get(id);
    }
}

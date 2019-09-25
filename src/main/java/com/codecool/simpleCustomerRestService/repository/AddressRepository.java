package com.codecool.simpleCustomerRestService.repository;

import com.codecool.simpleCustomerRestService.domain.Address;

import java.util.HashMap;
import java.util.Map;

public class AddressRepository {

    private static Long idSequence = 0L;
    private static final Map<Long, Address> data = new HashMap<>();

    public Address add(Address address) {
        address.setId(idSequence);
        data.put(idSequence++, address);
        return address;
    }


    public Address get(Long id) {
        return data.get(id);
    }
}

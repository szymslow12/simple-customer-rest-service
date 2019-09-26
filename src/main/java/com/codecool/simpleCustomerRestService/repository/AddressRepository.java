package com.codecool.simpleCustomerRestService.repository;

import com.codecool.simpleCustomerRestService.domain.Address;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
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

package com.codecool.simpleCustomerRestService.domain;

import com.codecool.simpleCustomerRestService.service.AddressService;
import com.codecool.simpleCustomerRestService.service.CustomerService;
import org.springframework.stereotype.Component;

import java.time.ZonedDateTime;

@Component
public class InitBean {

    public InitBean(AddressService addressService, CustomerService customerService) {
        Address address = new Address(0L,"Poland", "Cracow", "Grodzka", "30-000");
        Customer customer = new Customer(0L, "Jan", "Kowalski", "789789789", "kowalski@kowalski.com", address);
        addressService.add(address);
        customerService.add(customer);
        System.out.println(String.format("%s - Generated initial repository data", ZonedDateTime.now()));
    }
}

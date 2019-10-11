package tech.nullpointerexception.brewery.services;

import tech.nullpointerexception.brewery.web.model.CustomerDTO;

import java.util.UUID;

public interface CustomerService {
    CustomerDTO getCustomerById(UUID customerId);

    CustomerDTO saveNewCustomer(CustomerDTO customerDTO);

    void updateBeer(UUID customerId, CustomerDTO customerDTO);

    void deleteById(UUID customerId);
}

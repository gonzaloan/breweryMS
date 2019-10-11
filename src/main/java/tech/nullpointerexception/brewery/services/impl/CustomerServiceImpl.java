package tech.nullpointerexception.brewery.services.impl;

import org.springframework.stereotype.Service;
import tech.nullpointerexception.brewery.services.CustomerService;
import tech.nullpointerexception.brewery.web.model.CustomerDTO;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDTO getCustomerById(UUID customerId) {
        return CustomerDTO.builder()
                .uuid(UUID.randomUUID())
                .name("Test")
                .build();
    }

    @Override
    public CustomerDTO saveNewCustomer(CustomerDTO customerDTO) {

        return CustomerDTO.builder()
                .uuid(UUID.randomUUID())
                .name("Test")
                .build();
    }

    @Override
    public void updateBeer(UUID customerId, CustomerDTO customerDTO) {
        //todo fill this
    }

    @Override
    public void deleteById(UUID customerId) {
        //todo fill this.
    }
}

package org.example.bookshop.service.impl;

import lombok.AllArgsConstructor;
import org.example.bookshop.dto.CustomerDto;
import org.example.bookshop.repository.CustomerRepository;
import org.example.bookshop.service.CustomerService;
import org.springframework.core.convert.ConversionService;

import java.util.List;

@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    private final ConversionService conversionService;

    @Override
    public CustomerDto getCustomerById(Long id) {
        return null;
    }

    @Override
    public List<CustomerDto> getAllCustomers() {
        return null;
    }

    @Override
    public CustomerDto createCustomer(CustomerDto customerDto) {
        return null;
    }

    @Override
    public CustomerDto updateCustomer(CustomerDto customerDto) {
        return null;
    }

    @Override
    public void deleteCustomer(Long id) {

    }
}

package org.example.bookshop.service;

import org.example.bookshop.dto.CustomerDto;

import java.util.List;

public interface CustomerService {
    CustomerDto getCustomerById(Long id);
    List<CustomerDto> getAllCustomers();
    CustomerDto createCustomer(CustomerDto customerDto);
    CustomerDto updateCustomer(CustomerDto customerDto);
    void deleteCustomer(Long id);
}

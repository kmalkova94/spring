package org.example.bookshop.service;

import org.example.bookshop.dto.CustomerDto;
import org.example.bookshop.exceptions.CustomerException;

import java.util.List;

public interface CustomerService {
    CustomerDto getCustomerById(Long id) throws CustomerException;
    List<CustomerDto> getAllCustomers();
    CustomerDto createCustomer(CustomerDto customerDto);
    CustomerDto updateCustomer(CustomerDto customerDto) throws CustomerException;
    void deleteCustomer(Long id) throws CustomerException;
}

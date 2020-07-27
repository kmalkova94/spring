package org.example.bookshop.service.impl;

import org.example.bookshop.dto.CustomerDto;
import org.example.bookshop.entity.Customer;
import org.example.bookshop.exceptions.CustomerException;
import org.example.bookshop.repository.CustomerRepository;
import org.example.bookshop.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Component
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    private final ConversionService conversionService;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository, ConversionService conversionService) {
        this.customerRepository = customerRepository;
        this.conversionService = conversionService;
    }

    @Override
    public CustomerDto getCustomerById(Long id) throws CustomerException {
        Customer customer = customerRepository.findById(id).orElseThrow(() -> new CustomerException("Customer is not found"));
        return conversionService.convert(customer, CustomerDto.class);
    }

    @Override
    public List<CustomerDto> getAllCustomers() {
        List<Customer> customers = customerRepository.findAll();
        return customers.stream().map(customer -> conversionService.convert(customer, CustomerDto.class)).collect(Collectors.toList());
    }

    @Override
    public CustomerDto createCustomer(CustomerDto customerDto) {
        Customer customer = conversionService.convert(customerDto, Customer.class);
        return conversionService.convert(customerRepository.save(customer), CustomerDto.class);
    }

    @Override
    public CustomerDto updateCustomer(CustomerDto customerDto) throws CustomerException {
        Customer customer = customerRepository.findById(customerDto.getId()).orElseThrow(() -> new CustomerException("Customer is not found"));
        customer.setName(customerDto.getName());
        customer.setLogin(customerDto.getLogin());
        customer.setPassword(customerDto.getPassword());
        customer.setPhoneNumber(customerDto.getPhoneNumber());
        customer.setStatus(customerDto.getStatus());
        customer.setDeliveryAddress(customerDto.getDeliveryAddress());
        customer.setBonuses(customerDto.getBonuses());
        return conversionService.convert(customerRepository.save(customer), CustomerDto.class);
    }

    @Override
    public void deleteCustomer(Long id) throws CustomerException {
        Customer customer = customerRepository.findById(id).orElseThrow(() -> new CustomerException("Customer is not found"));
        customerRepository.delete(customer);
    }
}

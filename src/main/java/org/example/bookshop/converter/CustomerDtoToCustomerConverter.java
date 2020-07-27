package org.example.bookshop.converter;

import org.example.bookshop.dto.CustomerDto;
import org.example.bookshop.entity.Customer;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class CustomerDtoToCustomerConverter implements Converter<CustomerDto, Customer> {
    @Override
    public Customer convert(CustomerDto customerDto) {
        Customer customer = new Customer();
        customer.setId(customerDto.getId());
        customer.setName(customerDto.getName());
        customer.setLogin(customerDto.getLogin());
        customer.setBonuses(customerDto.getBonuses());
        customer.setDeliveryAddress(customerDto.getDeliveryAddress());
        customer.setPassword(customerDto.getPassword());
        customer.setPhoneNumber(customerDto.getPhoneNumber());
        customer.setStatus(customerDto.getStatus());
        return customer;
    }
}

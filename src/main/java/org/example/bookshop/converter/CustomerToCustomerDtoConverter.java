package org.example.bookshop.converter;

import org.example.bookshop.dto.CustomerDto;
import org.example.bookshop.entity.Customer;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class CustomerToCustomerDtoConverter implements Converter<Customer, CustomerDto> {
    @Override
    public CustomerDto convert(Customer customer) {
        CustomerDto target = new CustomerDto();
        target.setId(customer.getId());
        target.setName(customer.getName());
        target.setLogin(customer.getLogin());
        target.setPassword(customer.getPassword());
        target.setBonuses(customer.getBonuses());
        target.setDeliveryAddress(customer.getDeliveryAddress());
        target.setPhoneNumber(customer.getPhoneNumber());
        target.setStatus(customer.getStatus());
        return target;
    }
}

package org.example.bookshop.converter;

import lombok.AllArgsConstructor;
import org.example.bookshop.dto.AddressDto;
import org.example.bookshop.entity.Address;
import org.example.bookshop.repository.CustomerRepository;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class AddressDtoToAddressConverter implements Converter<AddressDto, Address> {
    private final CustomerRepository customerRepository;
    @Override
    public Address convert(AddressDto addressDto) {
        Address address = new Address();
        address.setId(addressDto.getId());
        address.setCountry(addressDto.getCountry());
        address.setCity(addressDto.getCity());
        address.setStreet(addressDto.getStreet());
        address.setHouse(addressDto.getHouse());
        address.setFlat(addressDto.getFlat());
        address.setIndex(addressDto.getIndex());
        address.setCustomer(customerRepository.findCustomerById(addressDto.getCustomerId()));
        return address;
    }
}

package org.example.bookshop.converter;

import org.example.bookshop.dto.AddressDto;
import org.example.bookshop.entity.Address;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class AddressToAddressDtoConverter implements Converter<Address, AddressDto> {

    @Override
    public AddressDto convert(Address address) {
        AddressDto target = new AddressDto();
        target.setId(address.getId());
        target.setCountry(address.getCountry());
        target.setCity(address.getCity());
        target.setStreet(address.getStreet());
        target.setHouse(address.getHouse());
        target.setFlat(address.getFlat());
        target.setIndex(address.getIndex());
        target.setCustomerId(address.getCustomer().getId());
        return target;
    }
}

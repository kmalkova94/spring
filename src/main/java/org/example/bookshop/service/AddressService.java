package org.example.bookshop.service;

import org.example.bookshop.dto.AddressDto;
import org.example.bookshop.exceptions.AddressException;
import org.example.bookshop.exceptions.CustomerException;

import java.util.List;

public interface AddressService {
    AddressDto getAddressById(Long id) throws AddressException;
    List<AddressDto> getAllAddresses();
    AddressDto createAddress(AddressDto addressDto);
    AddressDto updateAddress(AddressDto addressDto) throws AddressException, CustomerException;
    void deleteAddress(Long id) throws AddressException;
}

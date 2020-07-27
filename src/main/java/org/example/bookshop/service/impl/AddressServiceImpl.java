package org.example.bookshop.service.impl;

import org.example.bookshop.dto.AddressDto;
import org.example.bookshop.entity.Address;
import org.example.bookshop.exceptions.AddressException;
import org.example.bookshop.exceptions.CustomerException;
import org.example.bookshop.repository.AddressRepository;
import org.example.bookshop.repository.CustomerRepository;
import org.example.bookshop.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class AddressServiceImpl implements AddressService {

    private  AddressRepository addressRepository;
    private  CustomerRepository customerRepository;
    private  ConversionService conversionService;

    @Autowired
    public AddressServiceImpl(AddressRepository addressRepository, CustomerRepository customerRepository, ConversionService conversionService) {

        this.addressRepository = addressRepository;
        this.customerRepository = customerRepository;
        this.conversionService = conversionService;
    }

    @Override
    public AddressDto getAddressById(Long id) throws AddressException {
        Address address = addressRepository.findById(id).orElseThrow(() -> new AddressException("Address is not found"));
        return conversionService.convert(address, AddressDto.class);
    }

    @Override
    public List<AddressDto> getAllAddresses() {
        List<Address> addresses = addressRepository.findAll();
        return addresses.stream().map(address -> conversionService.convert(address, AddressDto.class)).collect(Collectors.toList());
    }

    @Override
    public AddressDto createAddress(AddressDto addressDto) {
        Address address = conversionService.convert(addressDto, Address.class);
        return conversionService.convert(addressRepository.save(address), AddressDto.class);
    }

    @Override
    public AddressDto updateAddress(AddressDto addressDto) throws AddressException, CustomerException {
        Address address = addressRepository.findById(addressDto.getId()).orElseThrow(() -> new AddressException("Address is not found"));
        address.setCountry(addressDto.getCountry());
        address.setCustomer(customerRepository.findById(addressDto.getCustomerId()).orElseThrow(() -> new CustomerException("Customer is not found")));
        address.setCity(addressDto.getCity());
        address.setStreet(addressDto.getStreet());
        address.setHouse(address.getHouse());
        address.setFlat(address.getFlat());
        address.setIndex(address.getIndex());
        return conversionService.convert(addressRepository.save(address), AddressDto.class);
    }

    @Override
    public void deleteAddress(Long id) throws AddressException {
        Address address = addressRepository.findById(id).orElseThrow(() -> new AddressException("Address is not found"));
        addressRepository.delete(address);
    }
}

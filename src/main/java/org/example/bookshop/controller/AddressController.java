package org.example.bookshop.controller;

import lombok.AllArgsConstructor;
import org.example.bookshop.dto.AddressDto;
import org.example.bookshop.exceptions.AddressException;
import org.example.bookshop.exceptions.CustomerException;
import org.example.bookshop.service.AddressService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/address")
public class AddressController {
    private final AddressService addressService;
    @GetMapping(value = "/{addressId}")
    public AddressDto getAddressId(@PathVariable("id") Long id) throws AddressException {
        return addressService.getAddressById(id);
    }
    @GetMapping
    public List<AddressDto> getAllAddresses() {
        return addressService.getAllAddresses();
    }

    @PostMapping
    public AddressDto createAddress(@RequestBody AddressDto addressDto) {
        return addressService.createAddress(addressDto);
    }

    @PutMapping
    public AddressDto updateAddress(@RequestBody AddressDto addressDto) throws CustomerException, AddressException {
        return addressService.updateAddress(addressDto);
    }

    @DeleteMapping
    public void deleteAddress(@PathVariable("id") Long id) throws AddressException {
        addressService.deleteAddress(id);
    }
}

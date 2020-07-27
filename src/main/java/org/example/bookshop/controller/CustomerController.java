package org.example.bookshop.controller;

import lombok.AllArgsConstructor;
import org.example.bookshop.dto.BookOrderDto;
import org.example.bookshop.dto.CustomerDto;
import org.example.bookshop.exceptions.BookOrderException;
import org.example.bookshop.exceptions.CustomerException;
import org.example.bookshop.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerService customerService;
    @GetMapping(value = "/{customerId}")
    public CustomerDto getCustomerId(@PathVariable("id") Long id) throws CustomerException {
        return customerService.getCustomerById(id);
    }
    @GetMapping
    public List<CustomerDto> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @PostMapping
    public CustomerDto createCustomer(@RequestBody CustomerDto customerDto) {
        return customerService.createCustomer(customerDto);
    }

    @PutMapping
    public CustomerDto updateCustomer(@RequestBody CustomerDto customerDto) throws CustomerException {
        return customerService.updateCustomer(customerDto);
    }

    @DeleteMapping
    public void deleteCustomer(@PathVariable("id") Long id) throws CustomerException {
        customerService.deleteCustomer(id);
    }
}

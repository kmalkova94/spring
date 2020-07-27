package org.example.bookshop.controller;

import lombok.AllArgsConstructor;
import org.example.bookshop.dto.CustomerDto;
import org.example.bookshop.dto.PublisherDto;
import org.example.bookshop.exceptions.CustomerException;
import org.example.bookshop.exceptions.PublisherException;
import org.example.bookshop.service.PublisherService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/publisher")
public class Publisher {
    private final PublisherService publisherService;
    @GetMapping(value = "/{publisherId}")
    public PublisherDto getPublisherId(@PathVariable("id") Long id) throws PublisherException {
        return publisherService.getPublisherById(id);
    }
    @GetMapping
    public List<PublisherDto> getAllPublishers() {
        return publisherService.getAllPublishers();
    }

    @PostMapping
    public PublisherDto createPublisher(@RequestBody PublisherDto publisherDto) {
        return publisherService.createPublisher(publisherDto);
    }

    @PutMapping
    public PublisherDto updatePublisher(@RequestBody PublisherDto publisherDto) throws PublisherException {
        return publisherService.updatePublisher(publisherDto);
    }

    @DeleteMapping
    public void deletePublisher(@PathVariable("id") Long id) throws PublisherException {
        publisherService.deletePublisher(id);
    }
}

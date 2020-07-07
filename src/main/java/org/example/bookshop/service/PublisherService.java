package org.example.bookshop.service;

import org.example.bookshop.dto.PublisherDto;

import java.util.List;

public interface PublisherService {
    PublisherDto getPublisherById(Long id);
    List<PublisherDto> getAllPublishers();
    PublisherDto createPublisher(PublisherDto publisherDto);
    PublisherDto updatePublisher(PublisherDto publisherDto);
    void deletePublisher(Long id);
}

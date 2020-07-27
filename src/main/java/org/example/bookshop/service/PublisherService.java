package org.example.bookshop.service;

import org.example.bookshop.dto.PublisherDto;
import org.example.bookshop.exceptions.PublisherException;

import java.util.List;

public interface PublisherService {
    PublisherDto getPublisherById(Long id) throws PublisherException;
    List<PublisherDto> getAllPublishers();
    PublisherDto createPublisher(PublisherDto publisherDto);
    PublisherDto updatePublisher(PublisherDto publisherDto) throws PublisherException;
    void deletePublisher(Long id) throws PublisherException;
}

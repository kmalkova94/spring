package org.example.bookshop.service.impl;

import lombok.AllArgsConstructor;
import org.example.bookshop.dto.PublisherDto;
import org.example.bookshop.repository.PublisherRepository;
import org.example.bookshop.service.PublisherService;
import org.springframework.core.convert.ConversionService;

import java.util.List;

@AllArgsConstructor
public class PublisherServicesImpl implements PublisherService {
    private final PublisherRepository publisherRepository;
    private final ConversionService conversionService;

    @Override
    public PublisherDto getPublisherById(Long id) {
        return null;
    }

    @Override
    public List<PublisherDto> getAllPublishers() {
        return null;
    }

    @Override
    public PublisherDto createPublisher(PublisherDto publisherDto) {
        return null;
    }

    @Override
    public PublisherDto updatePublisher(PublisherDto publisherDto) {
        return null;
    }

    @Override
    public void deletePublisher(Long id) {

    }
}

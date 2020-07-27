package org.example.bookshop.service.impl;

import org.example.bookshop.dto.PublisherDto;
import org.example.bookshop.entity.Publisher;
import org.example.bookshop.exceptions.PublisherException;
import org.example.bookshop.repository.PublisherRepository;
import org.example.bookshop.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class PublisherServicesImpl implements PublisherService {
    private final PublisherRepository publisherRepository;
    private final ConversionService conversionService;

    @Autowired
    public PublisherServicesImpl(PublisherRepository publisherRepository, ConversionService conversionService) {
        this.publisherRepository = publisherRepository;
        this.conversionService = conversionService;
    }

    @Override
    public PublisherDto getPublisherById(Long id) throws PublisherException {
        Publisher publisher = publisherRepository.findById(id).orElseThrow(() -> new PublisherException("Publisher is not found"));
        return conversionService.convert(publisher, PublisherDto.class);
    }

    @Override
    public List<PublisherDto> getAllPublishers() {
        List<Publisher> publishers = publisherRepository.findAll();
        return publishers.stream().map(publisher -> conversionService.convert(publisher, PublisherDto.class)).collect(Collectors.toList());
    }

    @Override
    public PublisherDto createPublisher(PublisherDto publisherDto) {
        Publisher publisher = conversionService.convert(publisherDto, Publisher.class);
        return conversionService.convert(publisherRepository.save(publisher), PublisherDto.class);
    }

    @Override
    public PublisherDto updatePublisher(PublisherDto publisherDto) throws PublisherException {
        Publisher publisher = publisherRepository.findById(publisherDto.getId()).orElseThrow(() -> new PublisherException("Publisher is not found"));
        publisher.setName(publisherDto.getName());
        publisher.setAddress(publisherDto.getAddress());
        publisher.setPhoneNumber(publisherDto.getPhoneNumber());
        return conversionService.convert(publisherRepository.save(publisher), PublisherDto.class);
    }

    @Override
    public void deletePublisher(Long id) throws PublisherException {
        Publisher publisher = publisherRepository.findById(id).orElseThrow(() -> new PublisherException("Publisher is not found"));
        publisherRepository.delete(publisher);
    }
}

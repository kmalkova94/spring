package org.example.bookshop.service.impl;

import lombok.AllArgsConstructor;
import org.example.bookshop.dto.StorageDto;
import org.example.bookshop.repository.StorageRepository;
import org.example.bookshop.service.StorageService;
import org.springframework.core.convert.ConversionService;

import java.util.List;

@AllArgsConstructor
public class StorageServiceImpl implements StorageService {
    private final StorageRepository storageRepository;
    private final ConversionService conversionService;

    @Override
    public StorageDto getStorageById(Long id) {
        return null;
    }

    @Override
    public List<StorageDto> getAllStorages() {
        return null;
    }

    @Override
    public StorageDto createStorage(StorageDto storageDto) {
        return null;
    }

    @Override
    public StorageDto updateStorage(StorageDto storageDto) {
        return null;
    }

    @Override
    public void deleteStorage(Long id) {

    }
}

package org.example.bookshop.service;

import org.example.bookshop.dto.StorageDto;

import java.util.List;

public interface StorageService {
    StorageDto getStorageById(Long id);
    List<StorageDto> getAllStorages();
    StorageDto createStorage(StorageDto storageDto);
    StorageDto updateStorage(StorageDto storageDto);
    void deleteStorage(Long id);
}

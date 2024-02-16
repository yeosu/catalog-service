package com.example.catalogservice.service;

import com.example.catalogservice.entity.CatalogEntity;
import com.example.catalogservice.vo.ResponseCatalog;

public interface CatalogService {
    Iterable<CatalogEntity> getAllCatalogs();
}

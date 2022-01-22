package com.productsapp.domain.service;

import com.productsapp.domain.service.dto.PageDTO;
import com.productsapp.domain.service.dto.ProductDTO;
import com.productsapp.validation.EntityAlreadyExistsException;
import com.productsapp.validation.EntityNotFoundException;
import org.springframework.data.domain.Pageable;

public interface ProductService {
    ProductDTO save(ProductDTO productDTO) throws EntityAlreadyExistsException;

    ProductDTO update(ProductDTO productDTO) throws EntityNotFoundException;
    PageDTO<ProductDTO> findAll(Pageable pageable);

    ProductDTO findById(Long id) throws EntityNotFoundException;
    void delete(Long id) throws EntityNotFoundException;
}

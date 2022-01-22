package com.productsapp.domain.service;

import com.productsapp.domain.service.dto.CategoryDTO;
import com.productsapp.domain.service.dto.PageDTO;
import com.productsapp.validation.EntityNotFoundException;
import com.productsapp.validation.EntityAlreadyExistsException;
import org.springframework.data.domain.Pageable;

public interface CategoryService {

    CategoryDTO save(CategoryDTO categoryDTO) throws EntityAlreadyExistsException;

    CategoryDTO update(CategoryDTO categoryDTO) throws EntityNotFoundException;

    PageDTO<CategoryDTO> findAll(Pageable pageable);

    PageDTO<CategoryDTO> searchByName(String name, Pageable pageable);
    CategoryDTO findById(Long id) throws EntityNotFoundException;

    void delete(Long id) throws EntityNotFoundException;
}

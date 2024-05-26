package com.FastBanana.productmicroservice.service;

import com.FastBanana.productmicroservice.entity.ProductEntity;
import com.FastBanana.productmicroservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {


    private final ProductRepository productRepository;


    public List<ProductEntity> getAllProductsList() {
        return productRepository.findAll();
    }


    public void createProductNew( ProductEntity productEntity, MultipartFile file) throws IOException {
        productRepository.save(productEntity);
    }

    public Optional<ProductEntity> findProductById(String id) {
        return productRepository.findById(id);
    }


    public void deleteProductById(String id) {
        productRepository.deleteById(id);
    }

    public void updateProduct(ProductEntity productEntity, MultipartFile file) throws IOException {
        productRepository.save(productEntity);
    }
}

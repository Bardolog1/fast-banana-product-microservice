package com.FastBanana.productmicroservice.controller;

import com.FastBanana.productmicroservice.entity.ProductEntity;
import com.FastBanana.productmicroservice.repository.ProductRepository;
import com.FastBanana.productmicroservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    @CrossOrigin(origins = {"http://localhost:5173", "http://localhost:3000", "http://localhost:8080", "http://localhost:5174"})
    @ResponseStatus(HttpStatus.OK)
    public List<ProductEntity> getAllproducts() {
        return productService.getAllProductsList();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductEntity productEntity) throws IOException {
        productService.createProductNew(productEntity, null);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<ProductEntity> searchProductById(@PathVariable String id) {
        return productService.findProductById(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteProductById(@PathVariable String id) {
        productService.deleteProductById(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updateProduct(@PathVariable String id, @RequestBody ProductEntity productEntity, MultipartFile file) throws IOException {
        productService.updateProduct(productEntity, null);
    }


}

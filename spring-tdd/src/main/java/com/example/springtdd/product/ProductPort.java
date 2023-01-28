package com.example.springtdd.product;

interface ProductPort {
    void save(Product product);

    Product getProduct(Long productId);
}

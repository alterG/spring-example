package com.example.mydemo.repository;

import com.example.mydemo.domain.Product;
import org.springframework.data.repository.CrudRepository;

/*
 * created by alterG (Igor_Shchipanov@epam.com)
 */
public interface ProductRepository extends CrudRepository<Product, Integer> {
}

package com.example.mydemo.bootstrap;

import com.example.mydemo.domain.Product;
import com.example.mydemo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.math.BigDecimal;

/**
 * created by alterG (Igor_Shchipanov@epam.com)
 */

@Component
public class Bootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private ProductRepository productRepository;

    @Autowired
    public Bootstrap(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

        Product product1 = new Product();
        product1.setDescription("Product 1");
        product1.setPrice(new BigDecimal("12.99"));
        productRepository.save(product1);

        Product product2 = new Product();
        product2.setDescription("Product 2");
        product2.setPrice(new BigDecimal("14.99"));
        productRepository.save(product2);

        Product product3 = new Product();
        product3.setDescription("Product 3");
        product3.setPrice(new BigDecimal("36.99"));

        productRepository.save(product3);
    }
}

package com.example.mydemo;

import com.example.mydemo.domain.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.math.BigDecimal;

@SpringBootApplication
public class MydemoApplication {

	public static void main(String[] args) {
		ApplicationContext cnt = SpringApplication.run(MydemoApplication.class, args);
		System.out.println("Realize how it works");

		EntityManagerFactory enf = cnt.getBean(EntityManagerFactory.class);
		EntityManager em = enf.createEntityManager();

		em.getTransaction().begin();

		Product product1 = new Product();
		product1.setDescription("Product 1");
		product1.setPrice(new BigDecimal("12.99"));
		em.merge(product1);

		Product product2 = new Product();
		product2.setDescription("Product 2");
		product2.setPrice(new BigDecimal("14.99"));
		em.merge(product2);

		Product product3 = new Product();
		product3.setDescription("Product 3");
		product3.setPrice(new BigDecimal("36.99"));
		em.merge(product3);

		em.getTransaction().commit();
	}
}

package ecommerce.repository;


import org.springframework.data.repository.CrudRepository;

import ecommerce.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
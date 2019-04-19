package ecommerce.repository;


import org.springframework.data.repository.CrudRepository;

import ecommerce.model.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
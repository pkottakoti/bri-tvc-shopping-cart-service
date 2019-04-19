package ecommerce.repository;

import org.springframework.data.repository.CrudRepository;

import ecommerce.model.OrderProduct;
import ecommerce.model.OrderProductPK;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}
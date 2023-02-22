package com.educandoweb.projectspring.repositories;

import com.educandoweb.projectspring.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}

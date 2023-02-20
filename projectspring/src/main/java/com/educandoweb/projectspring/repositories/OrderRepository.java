package com.educandoweb.projectspring.repositories;

import com.educandoweb.projectspring.entities.Order;
import com.educandoweb.projectspring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

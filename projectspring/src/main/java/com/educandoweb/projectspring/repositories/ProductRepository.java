package com.educandoweb.projectspring.repositories;

import com.educandoweb.projectspring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

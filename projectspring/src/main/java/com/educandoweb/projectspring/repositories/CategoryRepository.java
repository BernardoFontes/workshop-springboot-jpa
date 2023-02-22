package com.educandoweb.projectspring.repositories;

import com.educandoweb.projectspring.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}

package com.educandoweb.projectspring.repositories;

import com.educandoweb.projectspring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}

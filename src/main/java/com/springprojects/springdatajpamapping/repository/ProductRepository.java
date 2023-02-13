package com.springprojects.springdatajpamapping.repository;

import com.springprojects.springdatajpamapping.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}

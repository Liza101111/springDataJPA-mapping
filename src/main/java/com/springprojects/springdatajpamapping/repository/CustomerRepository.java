package com.springprojects.springdatajpamapping.repository;

import com.springprojects.springdatajpamapping.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}

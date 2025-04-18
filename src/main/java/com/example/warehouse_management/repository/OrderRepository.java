package com.example.warehouse_management.repository;

import com.example.warehouse_management.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    Long id(Long id);
}

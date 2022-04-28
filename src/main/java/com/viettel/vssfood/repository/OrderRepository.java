package com.viettel.vssfood.repository;

import com.viettel.vssfood.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Integer> {
}

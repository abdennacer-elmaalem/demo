package com.project.demo.repository;

import com.project.demo.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersRepo extends JpaRepository<Orders,Long> {
//    List<Order> findByFirstName(String firstName);
//    List<Order> findByName(String name);

}

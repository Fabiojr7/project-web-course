package com.study.course.repositories;

import com.study.course.entities.Order;
import com.study.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}

package com.study.course.repositories;

import com.study.course.entities.OrderItem;
import com.study.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}

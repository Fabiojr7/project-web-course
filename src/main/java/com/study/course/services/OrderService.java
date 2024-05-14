package com.study.course.services;

import com.study.course.entities.Order;
import com.study.course.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAllOrders(){
        return orderRepository.findAll();
    }

    public Order findOrderById(Long id){
        Optional<Order> order = orderRepository.findById(id);
        return order.get();
    }
}

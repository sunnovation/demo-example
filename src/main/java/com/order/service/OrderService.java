package com.order.service;

import org.springframework.stereotype.Service;

import com.order.entity.Order;
import com.order.repository.OrderRepository;

@Service
public class OrderService implements IOrderservice {

	private OrderRepository orderRepository;

	@Override
	public Order createOrder(Order order) {
		
		return orderRepository.save(order);
	}
	
	
}

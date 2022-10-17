package com.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.entity.Order;
import com.order.service.IOrderservice;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private IOrderservice orderService;
	
	@PostMapping("/add-order")
	public Order createOrder(@RequestBody Order order) {
		return orderService.createOrder(order);
	}
	
	
	
}

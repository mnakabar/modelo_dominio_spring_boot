package com.developper.modelo_dominio_no_springboot.controller;

import com.developper.modelo_dominio_no_springboot.entities.Order;
import com.developper.modelo_dominio_no_springboot.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/orders")
public class OrderController {

    @Autowired
    private OrderRepository repository;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id) {
        return ResponseEntity.ok(new Order());

    }
}
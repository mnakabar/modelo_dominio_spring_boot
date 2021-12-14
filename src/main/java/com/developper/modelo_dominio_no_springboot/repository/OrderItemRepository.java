package com.developper.modelo_dominio_no_springboot.repository;

import com.developper.modelo_dominio_no_springboot.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository <OrderItem,Long> {

}

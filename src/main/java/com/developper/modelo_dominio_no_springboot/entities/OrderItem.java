package com.developper.modelo_dominio_no_springboot.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "tb_order_item")
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer quantity;
    private Double price;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;



    public OrderItem(){

    }
    public OrderItem(Long id, Integer quantity, Double price, Product product, Order order){
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.product =product;
        this.order = order;
    }

    public double getSubTotal(){
        return quantity * price;
    }
}

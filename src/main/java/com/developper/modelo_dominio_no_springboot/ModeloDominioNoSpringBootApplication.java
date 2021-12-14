package com.developper.modelo_dominio_no_springboot;

import com.developper.modelo_dominio_no_springboot.entities.*;
import com.developper.modelo_dominio_no_springboot.repository.ClientRepository;
import com.developper.modelo_dominio_no_springboot.repository.OrderItemRepository;
import com.developper.modelo_dominio_no_springboot.repository.OrderRepository;
import com.developper.modelo_dominio_no_springboot.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Instant;
import java.util.Arrays;

@SpringBootApplication
public class ModeloDominioNoSpringBootApplication implements CommandLineRunner {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Autowired
    private OrderRepository orderRepository;

    public static void main(String[] args) {
        SpringApplication.run(ModeloDominioNoSpringBootApplication.class, args);
    }


    public void run (String... args)throws  Exception{
        Client c1 = new Client(null, "Jhony Garcia","jhonyg@outlook.com");
        Client c2 = new Client(null, "Ana Tabarez", "anatabarez@gmail.com");
        Client c3 = new Client(null, "Tereza Soares","tereza@gmail.com");

        clientRepository.save(c3);
        clientRepository.save(c1);
        clientRepository.save(c2);
        clientRepository.saveAll(Arrays.asList(c1,c2,c3));

        Product p1 = new Product(null, "TV", 1000.0);
        Product p2 = new Product(null, "Mouse", 40.0);
        Product p3 = new Product(null, "PC", 1200.0);

        productRepository.saveAll(Arrays.asList(p3,p2,p1));

        Order o1 = new Order(null, Instant.parse("2021-04-18T11:25:09Z"), OrderStatus.PAID, c1);
        Order o2 = new Order(null, Instant.parse("2021-09-20T13:30:15Z"), OrderStatus.WAITING, c2);
        Order o3 = new Order(null, Instant.parse("2021-05-21T16:30:12Z"), OrderStatus.CANCELED, c3);
        
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));

        OrderItem i1 = new OrderItem(null, 1, 1000.0, p1, o1);
        OrderItem i2 = new OrderItem(null, 2, 40.0, p2, o1);
        OrderItem i3 = new OrderItem(null, 1, 40.0, p2, o2);
        OrderItem i4 = new OrderItem(null, 1, 1200.0, p3, o2);

        orderItemRepository.saveAll(Arrays.asList(i1,i2,i3,i4));

    }

}

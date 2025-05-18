package com.dev.ecomercespringboot.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class OrderDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private double quantity;
    private double price;
    private double total;

    @OneToOne(cascade = CascadeType.ALL)
    private Order order;

    @OneToOne()
    private Product product;

}

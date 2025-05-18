package com.dev.ecomercespringboot.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String number;
    private Date date_created;
    private Date date_received;
    private double total;

    @ManyToOne
    private User user;

    @OneToOne(mappedBy = "order")
    private OrderDetails orderDetails;


}

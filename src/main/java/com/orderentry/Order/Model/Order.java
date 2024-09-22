package com.orderentry.Order.Model;

import javax.persistence.*;

@Entity
@Table(name = "orderofitem")
public class Order {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "item")
    private String item;

    @Column(name = "Location")
    private String location;

    @Column(name = "quantity")
    private String quantity;
}

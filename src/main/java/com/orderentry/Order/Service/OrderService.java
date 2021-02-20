package com.orderentry.Order.Service;

import com.orderentry.Order.Model.Order;

import java.util.List;

public interface OrderService {
    List<Order> getallorders();
    void saveorders(Order order);
    void deleteorderid(long id);
}

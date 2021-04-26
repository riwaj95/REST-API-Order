package com.orderentry.Order.Service;

import com.orderentry.Order.Model.Order;
import com.orderentry.Order.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceimpl implements OrderService{

    @Autowired
    private OrderRepository orderRepository;
    @Override
    public List<Order> getallorders() {
        return orderRepository.findAll();
    }

    @Override
    public void saveorders(Order order) {
        this.orderRepository.save(order);
    }

    @Override
    public void deleteorderid(long id) {
        this.orderRepository.deleteById(id);
    }


}

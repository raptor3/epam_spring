package ua.epam.rd.pizzadelivery.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

import ua.epam.rd.pizzadelivery.domain.Order;
import ua.epam.rd.pizzadelivery.repository.OrderRepository;
@Service("orderService")
public class TestOrderService implements OrderService {
    
    private OrderRepository orderRepository;
    
    @Autowired
    public TestOrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }   
    
    @Lookup(value="order")
    @Override
    public Order createNewOrder() {
        Long newOrderId = orderRepository.getNewOrderId();
        Date date = new Date();
        Order newOrder = new Order(newOrderId, date);
        return newOrder;
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.getAllOrders();
    }

    @Override
    public Order getOrderById(Long id) {
        return orderRepository.getOrderById(id);
    }

    @Override
    public Order placeOrder(Order order) {
        return orderRepository.placeOrder(order);
    }
}

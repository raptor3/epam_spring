package ua.epam.rd.pizzadelivery.repository;

import java.util.List;

import ua.epam.rd.pizzadelivery.domain.Order;

public interface OrderRepository {
    
    List<Order> getAllOrders();
    Order getOrderById(Long id);
    Order placeOrder(Order order);
    Long getNewOrderId();
}

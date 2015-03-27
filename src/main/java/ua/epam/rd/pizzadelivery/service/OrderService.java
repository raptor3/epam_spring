package ua.epam.rd.pizzadelivery.service;

import java.util.List;

import ua.epam.rd.pizzadelivery.domain.Order;

public interface OrderService {
    List<Order> getAllOrders();
    Order getOrderById(Long id);
    Order createNewOrder();
    Order placeOrder(Order order);
}

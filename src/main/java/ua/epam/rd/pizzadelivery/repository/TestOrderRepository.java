package ua.epam.rd.pizzadelivery.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import ua.epam.rd.pizzadelivery.domain.Order;
@Repository("orderRepository")
public class TestOrderRepository implements OrderRepository {
    private Long nextId = 1L;
    private Map<Long, Order> allOrders = new HashMap<Long, Order>();
    
    
    @Override
    public List<Order> getAllOrders() { 
        return new ArrayList<Order>(allOrders.values());
    }

    @Override
    public Order getOrderById(Long id) {
        return allOrders.get(id);
    }

    @Override
    public Order placeOrder(Order order) {
        order.setId(getNewOrderId());
        order.setDate(new Date());
        allOrders.put(order.getId(), order);
        return order;
    }
    
    @Override
    public Long getNewOrderId() {
        Long result = nextId;
        nextId = nextId + 1;
        return result;
    }
}

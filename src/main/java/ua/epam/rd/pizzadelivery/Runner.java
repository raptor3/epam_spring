package ua.epam.rd.pizzadelivery;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.SocketUtils;

import ua.epam.rd.pizzadelivery.domain.Order;
import ua.epam.rd.pizzadelivery.domain.Pizza;
import ua.epam.rd.pizzadelivery.service.OrderService;
import ua.epam.rd.pizzadelivery.service.PizzaService;

public class Runner {

    public static void main(String[] args) {
        ApplicationContext appContextParent =
                new ClassPathXmlApplicationContext("Repository.xml");
        ApplicationContext appContext =
                new ClassPathXmlApplicationContext(new String[]{"MySpringConfig.xml"},appContextParent);
        
        PizzaService pizzaService =(PizzaService) appContext.getBean("pizzaService");
            
        OrderService orderService =(OrderService) appContext.getBean("orderService");
        
        List<Pizza> pizzas = pizzaService.getAllPizzas();           
        Order newOrder1 = orderService.createNewOrder();
        newOrder1.addItems(pizzas.get(0), pizzas.get(1));
        orderService.placeOrder(newOrder1);
        
        Order newOrder2 = orderService.createNewOrder();
        newOrder2.addItems(pizzas.get(0));
        orderService.placeOrder(newOrder2);
        
        List<Order> orders = orderService.getAllOrders();
        orders.stream().forEach(System.out::println);
        System.out.println("Parent");
        for (String name : appContextParent.getBeanDefinitionNames()) {
            System.out.println(name);            
        }
        System.out.println("Child");
        for (String name : appContext.getBeanDefinitionNames()) {
            System.out.println(name);            
        }
    }

}

package ua.epam.rd.pizzadelivery.repository;

import java.util.List;

import ua.epam.rd.pizzadelivery.domain.Pizza;
import ua.epam.rd.pizzadelivery.domain.PizzaType;

public interface PizzaRepository {
    List<Pizza> getAllPizzas();
    void add(Pizza pizza);
    List<Pizza> getPizzasByType(PizzaType type);
}

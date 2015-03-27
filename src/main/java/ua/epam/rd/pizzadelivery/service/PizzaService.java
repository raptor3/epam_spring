package ua.epam.rd.pizzadelivery.service;

import java.util.List;

import ua.epam.rd.pizzadelivery.domain.Pizza;
import ua.epam.rd.pizzadelivery.domain.PizzaType;

public interface PizzaService {
    List<Pizza> getAllPizzas();
    List<Pizza> getPizzasByType(PizzaType type);
}

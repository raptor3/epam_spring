package ua.epam.rd.pizzadelivery.repository;

import java.util.ArrayList;
import java.util.List;

import ua.epam.rd.pizzadelivery.domain.Pizza;
import ua.epam.rd.pizzadelivery.domain.PizzaType;

public class TestPizzaRepository implements PizzaRepository {
    private List<Pizza> allPizzas;
    
    public TestPizzaRepository() {        
    }
    
    
    
    public void setAllPizzas(List<Pizza> allPizzas) {
        this.allPizzas = allPizzas;
    }

    @Override
    public void add(Pizza pizza) {
        allPizzas.add(pizza);    
    }
    @Override
    public List<Pizza> getAllPizzas() {        
        return new ArrayList<Pizza>(allPizzas);
    }
    
    @Override
    public List<Pizza> getPizzasByType(PizzaType type) {
        List<Pizza> result = new ArrayList<Pizza>();
        for (Pizza pizza : allPizzas) {
            if (pizza.getType() == type) {
                result.add(pizza);
            }
        }
        return result;
    }
    
}

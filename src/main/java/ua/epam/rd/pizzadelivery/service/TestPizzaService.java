package ua.epam.rd.pizzadelivery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.epam.rd.pizzadelivery.domain.Pizza;
import ua.epam.rd.pizzadelivery.domain.PizzaType;
import ua.epam.rd.pizzadelivery.repository.PizzaRepository;
@Service("pizzaService")
public class TestPizzaService implements PizzaService {
    
    PizzaRepository pizzaRepository;
   
    @Autowired
    public TestPizzaService(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }

    @Override
    public List<Pizza> getAllPizzas() {        
        return pizzaRepository.getAllPizzas();
    }
    
    @Override
    public List<Pizza> getPizzasByType(PizzaType type) {        
        return pizzaRepository.getPizzasByType(type);
    }

}

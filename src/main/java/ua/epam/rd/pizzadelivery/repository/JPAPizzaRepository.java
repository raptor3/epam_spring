package ua.epam.rd.pizzadelivery.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import ua.epam.rd.pizzadelivery.domain.Pizza;
import ua.epam.rd.pizzadelivery.domain.PizzaType;

public class JPAPizzaRepository implements PizzaRepository {

    private EntityManagerFactory emf;  
    
    public JPAPizzaRepository(EntityManagerFactory entityManagerFactory) {
        this.emf = entityManagerFactory;
    }
    
    @Override
    public List<Pizza> getAllPizzas() {
        EntityManager em = emf.createEntityManager();
        return null;
    }

    @Override
    public void add(Pizza pizza) {
        EntityManager em = emf.createEntityManager();
       // em.getTransaction().begin();
        em.persist(pizza);
       // em.getTransaction().commit();
        em.close();
    }

    @Override
    public List<Pizza> getPizzasByType(PizzaType type) {
        return null;
    }

}

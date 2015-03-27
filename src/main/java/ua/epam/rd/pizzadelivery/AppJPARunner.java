package ua.epam.rd.pizzadelivery;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ua.epam.rd.pizzadelivery.domain.Pizza;
import ua.epam.rd.pizzadelivery.domain.PizzaType;

public class AppJPARunner {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateMySQL");
        EntityManager em = emf.createEntityManager();
        
        Pizza pizza = new Pizza();
        pizza.setName("Oliva");
        pizza.setType(PizzaType.CHEESE_PIZZA);
        pizza.setPrice(123.1);
        
        System.out.println("Before: " + pizza);
        //em.getTransaction().begin();
        em.persist(pizza);
        //em.getTransaction().commit();
        
        
        System.out.println("After: " + pizza);
        
        System.out.println(em.find(Pizza.class, new Long(1)));
        
        em.close();
        emf.close();
    }

}

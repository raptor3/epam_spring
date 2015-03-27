package ua.epam.rd.pizzadelivery.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.context.annotation.Scope;

import ua.epam.rd.pizzadelivery.OrderAnnotation;

@OrderAnnotation
@Scope("prototype")
public class Order {
    
    private Long id;
    private Date date;
    private String name;
    private List<Pizza> pizzas;
    private Double price;
    
    public Order() {
        this.name = date + " id=" + id;
        this.pizzas = new ArrayList<Pizza>();
        this.price = new Double(0);
    }
    
    public Order(Long id, Date date) {
        this.id = id;
        this.date = date;
        this.name = date + " id=" + id;
        this.pizzas = new ArrayList<Pizza>();
        this.price = new Double(0);
    }

    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
        this.name = date + " id=" + id;
    }

    public Date getDate() {
        return date;
    }
    
    public void setDate(Date date) {
        this.date=date;
        this.name = date + " id=" + id;
    }

    public String getName() {
        return name;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void addItems(Pizza... pizzas) {
        for (Pizza pizza : pizzas) {
            this.pizzas.add(pizza);
            price += pizza.getPrice();
        }
    }

    public void addItems(List<Pizza> pizzas) {
        for (Pizza pizza : pizzas) {
            this.pizzas.add(pizza);
            price += pizza.getPrice();
        }
    }

    @Override
    public String toString() {
        return "Order [id=" + id + ", date=" + date + ", name=" + name
                + ", pizzas=" + pizzas + ", price=" + price + "]";
    }
    


}

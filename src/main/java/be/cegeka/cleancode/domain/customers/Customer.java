package be.cegeka.cleancode.domain.customers;


import be.cegeka.cleancode.domain.cards.Card;

import javax.persistence.*;

@Entity
@Table(name = "CUSTOMERS")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "NAME")
    private String name;
    @OneToOne
    @JoinColumn(name = "CARD_ID")
    private Card card;

    public Customer() {

    }

    public Customer(String name) {
        this.name = name;
    }

    public Customer(CustomerBuilder builder){
        this.name = builder.getName();
        this.id = builder.getId();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Customer addCard(Card card) {
        this.card = card;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (id != customer.id) return false;
        if (name != null ? !name.equals(customer.name) : customer.name != null) return false;
        return card != null ? card.equals(customer.card) : customer.card == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (card != null ? card.hashCode() : 0);
        return result;
    }
}

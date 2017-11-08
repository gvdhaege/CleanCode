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
}

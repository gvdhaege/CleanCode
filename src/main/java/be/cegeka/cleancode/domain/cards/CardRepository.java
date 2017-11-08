package be.cegeka.cleancode.domain.cards;

import be.cegeka.cleancode.domain.customers.Customer;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Named
public class CardRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void addCard(Card card){
        entityManager.persist(card);
    }

    public Card findCard(String barcode) {
        return entityManager.createQuery("select c from Card c where c.barcode = :barcode", Card.class)
                .setParameter("barcode", barcode)
                .getSingleResult();
    }

}

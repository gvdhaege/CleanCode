package be.cegeka.cleancode.domain.cards;

import be.cegeka.cleancode.domain.customers.Customer;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Named
public class CardService {
    @Inject
    private CardRepository cardRepository;
    @PersistenceContext
    private EntityManager entityManager;

    public void addCard(String barcode){
        Card card = new Card(barcode);
        cardRepository.addCard(card);
    }

}

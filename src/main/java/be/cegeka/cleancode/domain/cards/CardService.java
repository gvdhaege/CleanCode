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

//    public void findCard(String barcode, String user_id) {
//        Customer customer = entityManager.createQuery("select c from Customer c where c.id = user_id", Customer.class)
//                .setParameter(user_id, user_id)
//                .getSingleResult();
//        cardRepository.findCard(barcode, customer);
//    }
}

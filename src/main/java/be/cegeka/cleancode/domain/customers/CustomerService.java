package be.cegeka.cleancode.domain.customers;

import be.cegeka.cleancode.domain.cards.Card;
import be.cegeka.cleancode.domain.cards.CardRepository;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Named
public class CustomerService {
    @Inject
    private CustomerRepository customerRepository;
    @Inject
    private CardRepository cardRepository;


    public void addCustomer(String name) {
        CustomerBuilder customerBuilder = new CustomerBuilder();
        customerRepository.addCustomer(customerBuilder.withName(name)
                .buildFull());
    }

    public void linkCard(String barcode, int customer_id) {
        Customer customer = customerRepository.findCustomerByID(customer_id);
        Card card = cardRepository.findCardByBarcode(barcode);
        customer.addCard(card);
    }

    public Customer findCustomerByBarcode(String barcode) {
        Card card = cardRepository.findCardByBarcode(barcode);
        int cardId = card.getId();
        return customerRepository.findCustomerByID(cardId);
    }
}

package be.cegeka.cleancode.domain.customers;


import be.cegeka.cleancode.domain.cards.Card;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Named
public class CustomerRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void addCustomer(Customer customer) {
        entityManager.persist(customer);
    }

    public Customer findCustomerByID(int user_id) {
        return entityManager.createQuery("select c from Customer c where c.id = :user_id", Customer.class)
                .setParameter("user_id", user_id)
                .getSingleResult();
    }


}
package be.cegeka.cleancode.domain.customers;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

public class CustomerServiceTest {

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private CustomerService customerService;

    @Mock
    private CustomerRepository customerRepository;


    @Test
    public void addCustomer_shouldCallInCustomerRepository() throws Exception {
        customerService.addCustomer("jefke");
        verify(customerRepository).addCustomer(new Customer("jefke"));
    }

}
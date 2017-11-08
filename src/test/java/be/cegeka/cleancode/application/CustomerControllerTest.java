package be.cegeka.cleancode.application;

import be.cegeka.cleancode.domain.customers.Customer;
import be.cegeka.cleancode.domain.customers.CustomerService;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class CustomerControllerTest {

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private CustomerController customerController;

    @Mock
    private CustomerService customerService;


    @Test
    public void addCustomer_shouldCallCorrespondingMethodInCustomerService() throws Exception {
        customerController.addCustomer("jefke");
        verify(customerService).addCustomer("jefke");
    }

    @Test
    public void linkCard_shouldCallLinkCardInCustomerService() throws Exception {
        customerController.linkCard("123456", 35);
        verify(customerService).linkCard("123456", 35);
    }

    @Test
    public void findCustomerByBarcode_shouldCallFindCustomerByBarcodeInCustomerService() throws Exception {
        customerController.findByBarcode("123456");
        verify(customerService).findCustomerByBarcode("123456");
    }


}
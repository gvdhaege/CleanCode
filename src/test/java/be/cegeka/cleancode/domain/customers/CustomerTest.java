package be.cegeka.cleancode.domain.customers;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    @Test
    public void getNameCalledOnAConstructedCustomer_shouldReturnCorrectName() throws Exception {
        Customer testDude = new Customer("duderino");
        Assertions.assertThat(testDude.getName()).isEqualToIgnoringCase("duderino");
    }


}
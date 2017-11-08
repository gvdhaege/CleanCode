package be.cegeka.cleancode.domain.customers;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerBuilderTest {


    @Test
    public void withName_shouldPutNameInField() throws Exception {
        CustomerBuilder customerBuilder = new CustomerBuilder();
        customerBuilder.withName("Jefke");
        Assertions.assertThat(customerBuilder.getName()).isEqualToIgnoringCase("Jefke");
    }

    @Test
    public void aCustomerBuilderWithNameJefkeAfterABuild_shouldReturnACustomerNamedJefke() throws Exception {
        CustomerBuilder customerBuilder = new CustomerBuilder();
        Customer jefke = customerBuilder.withName("Jefke")
                .buildFull();
        Assertions.assertThat(jefke.getName()).isEqualToIgnoringCase("Jefke");
    }
}
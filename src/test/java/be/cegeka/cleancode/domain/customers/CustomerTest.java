package be.cegeka.cleancode.domain.customers;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

public class CustomerTest {
    Customer testDude = new Customer("dude");

    @Test
    public void getNameCalledOnAConstructedCustomer_shouldReturnCorrectName() throws Exception {

        assertThat(testDude.getName()).isEqualToIgnoringCase("dude");
    }

    @Test
    public void equals_NullObject_IsFalse() throws Exception {
        assertThat(testDude).isNotEqualTo(null);
    }

    @Test
    public void equals_OtherClass_IsFalse() throws Exception {
        assertThat(testDude).isNotEqualTo(new Object());
    }

//    @Test
//    public void equals_ObjectWithOtherId_IsFalse() throws Exception {
//        CustomerBuilder customerBuilder = new CustomerBuilder();
//        Customer notExpected = customerBuilder
//                .withId(testDude.getId() + 2)
//                .withName("dude")
//                .buildFull();
//        assertThat(testDude).isNotEqualTo(notExpected);
//    }
}
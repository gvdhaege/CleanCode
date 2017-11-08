package be.cegeka.cleancode.domain.cards;

import be.cegeka.cleancode.Application;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = Application.class)
@Transactional
public class CardRepositoryTest {

    @Inject
    private CardRepository cardRepository;

    @PersistenceContext
    private EntityManager entityManager;
    private Card testCard = new Card("123456");

    @Before
    public void setup() {
        cardRepository.addCard(testCard);
    }

    @Test
    public void addCard_shouldAddTheCardToDatabase() throws Exception {
        Card actual = cardRepository.findCardByID(testCard.getId());
        Assertions.assertThat(actual).isEqualTo(testCard);
    }

    @Test
    public void findCardByBarcode_shouldReturnCard() throws Exception {
        Card actual = cardRepository.findCardByBarcode(testCard.getBarcode());
        Assertions.assertThat(actual).isEqualTo(testCard);
    }
}
package be.cegeka.cleancode.domain.cards;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import static org.mockito.Mockito.verify;

import javax.inject.Inject;

import static org.junit.Assert.*;

public class CardServiceTest {

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @Mock
    CardRepository cardRepository;
    @InjectMocks
    CardService cardService;


    @Test
    public void addCard_shouldCallMethodInCardRepository() throws Exception {
        cardService.addCard("123456");
        verify(cardRepository).addCard(new Card("123456"));
    }
}
package be.cegeka.cleancode.application;

import be.cegeka.cleancode.domain.cards.CardService;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

public class CardControllerTest {

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private CardController cardController;

    @Mock
    private CardService cardService;

    @Test
    public void addCard_shouldActivateMethodInCardService() throws Exception {
        cardController.addCard("123456");
        verify(cardService).addCard("123456");
    }
}
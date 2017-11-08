package be.cegeka.cleancode.application;


import be.cegeka.cleancode.domain.cards.CardService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import javax.transaction.Transactional;

@RestController
@RequestMapping(path = "/card")
@Transactional
public class CardController {

    @Inject
    CardService cardService;

    @PostMapping(path = "/addCard")
    public void addCard(String barcode){
        cardService.addCard(barcode);
    }



}

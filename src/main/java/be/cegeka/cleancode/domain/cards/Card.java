package be.cegeka.cleancode.domain.cards;

import be.cegeka.cleancode.domain.customers.Customer;

import javax.persistence.*;

@Entity
@Table(name = "CARDS")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "BARCODE")
    private String barcode;
    @Column(name = "BONUS_POINTS")
    private int bonusPoints;

    public Card(){

    }

    public Card(String barcode){
        this.barcode = barcode;
    }

    public int getId() {
        return id;
    }

    public String getBarcode() {
        return barcode;
    }

    public int getBonusPoints() {
        return bonusPoints;
    }

}

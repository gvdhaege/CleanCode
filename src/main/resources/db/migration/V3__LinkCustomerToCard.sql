ALTER TABLE customers
ADD CONSTRAINT CARD_ID FOREIGN KEY (CARD_ID)
REFERENCES cards(id)
;


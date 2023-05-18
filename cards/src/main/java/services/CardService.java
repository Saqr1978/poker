package main.java.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import main.java.entities.Card;
import main.java.entities.Card.Color;
import main.java.entities.Card.Value;

@Service
public class CardService {
  
  public Object[] hand() {
    Object[] hand = new Object[2];
    List<Card> handToSort = unsortedHand();
    hand[0] = new ArrayList<Card>(handToSort);
    Collections.sort(handToSort, (x, y) -> {
        if (x.getColor().getCode() != y.getColor().getCode()) {
          return x.getColor().getCode() - y.getColor().getCode();
        } else {
        return x.getValue().getCode() - y.getValue().getCode();
        }
      });
    hand[1] = handToSort;
    return hand;
  }

  public List<Card> unsortedHand() {
    List<Card> unsortedHand = new ArrayList<Card>();
    for(int i = 0; i < 10; i++) {
      int colorCode = (int) (Math.random() * 4) % 4;
      int valueCode = (int) (Math.random() * 13) % 13;
      
      while(existsInHand(unsortedHand, colorCode, valueCode)) {
        colorCode = (int) (Math.random() * 4) % 4;
        valueCode = (int) (Math.random() * 13) % 13;
      }
      Card card = new Card(colorByCode(colorCode), valueByCode(valueCode));
      unsortedHand.add(card);
    }
    return unsortedHand;
  }
  
  private Color colorByCode(int code) {
    Color returnColor = null;
    for(Color color : Color.values()) {
      if (color.getCode() == code) {
        returnColor = color;
      }
    }
    return returnColor;
  }
  
  private Value valueByCode(int code) {
    Value returnValue = null;
    for(Value value : Value.values()) {
      if (value.getCode() == code) {
        returnValue = value;
      }
    }
    return returnValue;
  }
  
  private boolean existsInHand(List<Card> hand, int colorCode, int valueCode) {
    boolean existsInHand = false;
    for(Card card : hand) {
      if(card.getColor().getCode() == colorCode && card.getValue().getCode() == valueCode) {
        existsInHand = true;
        break;
      }
    }
    return existsInHand;
  }
}

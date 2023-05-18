package main.java.entities;

public class Card {
  
  public enum Color {
    CARREAUX(0) ,COEUR(1), PIQUE(2), TREFLE(3);
    
    int code;
    
    Color(int code) {
      this.code = code;
    }
    
    public int getCode() {
      return this.code;
    }
  }
  
  public enum Value {
    AS(0), DEUX(1), TROIS(2), QUATRE(3), CINQ(4), SIX(5),
    SEPT(6), HUIT(7), NEUF(8), DIX(9), VALET(10), DAME(11), ROI(12);
    
    int code;
    
    Value(int code) {
      this.code = code;
    }
    
    public int getCode() {
      return this.code;
    }
  }
  
  private Color color;
  
  private Value value;
  
  
  
  public Card() {
    super();
  }

  public Card(Color color, Value value) {
    super();
    this.color = color;
    this.value = value;
  }

  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public Value getValue() {
    return value;
  }

  public void setValue(Value value) {
    this.value = value;
  }

}

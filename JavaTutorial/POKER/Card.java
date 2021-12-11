public class Card {
  private final String face; // face of card ("Deuce","Ace")
  private final String suit;// suit of card("Hearths,Diamonds")
  // two arguiment constructor to innitialiase face and suit of card
  public Card(String cardFace ,String cardSuit){
    this.face = cardFace;// innitialise face of card
    this.suit = cardSuit;// innitialise suit of card
  }

  // return String representation of card
  public String toString(){
    return face + " of " + suit;
  }

}

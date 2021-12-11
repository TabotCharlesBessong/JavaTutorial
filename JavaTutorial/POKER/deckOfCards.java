import java.security.SecureRandom;

public class deckOfCards {
  private Card[] deck; // array of card objects
  private int currentCard;
  private static final int NUMBER_OF_CARDS = 52;
  // random generator of cards
  private static final SecureRandom ranNum = new SecureRandom();

  //constructor to fill deck of cards
  public void DeckOfCards(){
    String[] faces = {"Ace","Deuce","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
    String[] suits = {"Hearts","Diamonds","Clubs","SPades"};

    deck = new Card[NUMBER_OF_CARDS];
    currentCard = 0; 

    // populate deck with card object
    for(int count = 0;count<deck.length;count++)
      deck[count] = new Card(faces[count % 13],suits[count/13]);
  }

  // shuffle  deck of Cards with one-pass algorithm
  public void shuffle(){
    // call should start at 0
    currentCard = 0;
    for(int first = 0;first < deck.length;first++){
      int second = ranNum.nextInt(NUMBER_OF_CARDS);
      // System.out.printf("%d%n",second);

      // swap card with randomly selected card
      Card temp = deck[first];
      deck[first] = deck[second];
      deck[second] = temp;
    }
  }
  public Card dealCard(){
    // determine if Cards remain to be dealt
    if(currentCard < deck.length)
      return deck[currentCard++];// return current Card in the array
    else
      return null; // return null to indicates all Cards were dealt
  }
}


//  unbiased shuffling algorithm for real card games
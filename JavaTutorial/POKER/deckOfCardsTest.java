public class deckOfCardsTest {
  // execute application 
  public static  void main(String[] args){
    deckOfCards myDeckOfCards = new deckOfCards();
    myDeckOfCards.shuffle(); // place cards in random orders 

    // print all 52 cards in order in which they are dealt 
    for(int i= 1;i<=52;i++){
      System.out.printf("%-19s",myDeckOfCards.dealCard());
      if(i % 4 == 0)
        System.out.println();
    }
  }
}

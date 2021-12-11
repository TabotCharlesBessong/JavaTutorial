public class BasicWhileLoop {
  public static void main(String[] args){
    int counter = 1;
    int reverseCounter = 20;
    while(counter <= 10){
      System.out.printf("%d%n ", counter);
      counter++;
    }
    for (int i = 10;i>=0;i --){
      System.out.printf("%d%n ",reverseCounter);
      reverseCounter -=2;
    }
    System.out.println();
    System.out.println(Math.sqrt(1600));
  }
}

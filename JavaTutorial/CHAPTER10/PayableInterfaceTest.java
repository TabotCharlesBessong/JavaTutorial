public class PayableInterfaceTest {
  public static void main(String[] args){
    Payable[] payableObjects = new Payable[2];

    payableObjects[0] = new Invoice("01234", "seat", 2, 375);
    payableObjects[1] = new Invoice("56789", "tire", 4, 79.95);

    System.out.println("Invoice and employees processed polymorphically:");

    for(Payable curr : payableObjects ){
      System.out.printf("%n%s %n%s: $%,.2f%n",curr.toString(),"payment due",curr.getPaymentAmount());
    }
  }
}

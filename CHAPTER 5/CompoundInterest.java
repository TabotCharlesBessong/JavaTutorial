public class CompoundInterest {
  public static void main(String[] args){
    Double amount = 1000.00;
    double profit = 0.1;
    int period = 19;
    Double bonus;
    for(int i = 1;i<=period;i++){
      bonus = (Double) (amount * profit) ; 
      amount += bonus;
      System.out.printf("The investment after %d year(s) is    %.3f %n",i,amount);
    }
    System.out.printf("The total investment is %.3f : ",amount);
  }
}

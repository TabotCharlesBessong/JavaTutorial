public class spreadOperator {
  // public static void main(String[] args){
    public static double average(double...num){
      double total = 0.0;
      for(double d:num)
        total +=d;
      return total / num.length;
    } 
    public static void main(String[] args){
      double d1 = 17.0;
      double d2 = 37.0;
      double d3 = 27.0;
      double d4 = 47.0;
      System.out.printf("d1 = %.1f%nd2 = %.1f%nd3 = %.1f%nd4 = %.1%fn%n",d1,d2,d3,d4);
      System.out.printf("Average of d1 and d2 is %.1f%n",average(d1,d2));
      System.out.printf("Average of d1 and d2 and d3 is %.1f%n",average(d1,d2,d3));
      System.out.printf("Average of d1 , d2 , d3 and d4  is %.1f%n",average(d1,d2,d3,d4));
    }
  }
// }

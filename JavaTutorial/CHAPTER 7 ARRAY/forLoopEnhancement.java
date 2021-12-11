public class forLoopEnhancement {
  public static void main(String[] args){
    int[] array = {87,73,94,100,83,89,85,91,86,87};
    int total = 0;
    int n = array.length;
    for(int string: array)
      total += string;
    double avg = (double) total/n;
    System.out.printf("Total element of the array: %d%n", total);
    System.out.printf("The average of all elemement is : %.2f%n",avg);
  }
}

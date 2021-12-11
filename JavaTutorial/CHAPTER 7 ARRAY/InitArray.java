public class InitArray {
  public static void  main(String[] args){
    if(args.length != 3)
      System.out.printf("Error:PLease re-enter the entire command including"+ " an array size , inntial value and increment. %n");
    
    else{
      int arrayLength = Integer.parseInt(args[0]);
      int[] array = new int[arrayLength];
      int innitialValue = Integer.parseInt(args[1]);
      int increment = Integer.parseInt(args[2]);

      for(int counter = 0; counter < array.length ; counter++)
        array[counter] = innitialValue + increment * counter;
      
      System.out.printf("%s%8s%n","Index0","Value");
      for(int counter = 0 ; counter < array.length ; counter++)
        System.out.printf("%5d%8d%n",counter,array[counter]);
      
    }
  }
}

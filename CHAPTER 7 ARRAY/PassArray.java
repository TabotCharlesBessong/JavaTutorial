public class PassArray {
  public static void main(String[] args){
    int[] array = {1,2,3,4,5};
    System.out.printf("The effect of passing reference to entire array:%n" + "The value of the original array are: %n");

    for(int value : array)
      System.out.printf("  %d", value);
    
    modifyArray(array);
    System.out.printf("%n%nThe values of the modified array are: %n");
    for(int value:array)
      System.out.printf("  %d", value);
    System.out.printf("%n%nEffect of passing array elementvalue:%n" + "array[3] before modifying : %d%n" , array[3]);

    modifyElement(array[3]);
    System.out.printf("array[3] after modifying theelement %d%n",array[3]);
  }

  public static void modifyArray(int[] array2){
    for(int counter = 0;counter<array2.length;counter++)
      array2[counter] *=2; 
  }

  public static void modifyElement(int element){
    element *=2;
    System.out.printf("Value of element in modifying : %d%n",element);
  }
}


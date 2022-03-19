
import java.util.Arrays;

public class ArrayMethod {
  public static void main(String[] args){
    double[] doubleArray = {8.4, 9.3, 0.2, 7.9, 3.4};
    Arrays.sort(doubleArray);
    System.out.printf("%ndoubleArray: ");

    for(double value : doubleArray)
      System.out.printf("%n%.1f",value);
    int[] filledArray = new int[10];
    Arrays.fill(filledArray,9);
    displayArray(filledArray,"filledArray");

    // copy one array into another
    int[] arr = {1,2,3,4,5,6,7};
    int[] arrCopy = new int[arr.length];
    System.arraycopy(arr, 0, arrCopy, 0, arr.length);
    displayArray(arr,"original Array");
    displayArray(arrCopy,"copied array");

    // compare 
    boolean b = Arrays.equals(arr, arrCopy);
    System.out.printf("%n%n%arr %s arrCopy",(b ? "==":"!="));
    b = Arrays.equals(arr, filledArray);
    System.out.printf("%n%n%arr %s filledArray",(b ? "==":"!="));

    int location = Arrays.binarySearch(arr, 3);
    if(location >=0)
      System.out.printf("Found 5 at the element % in arr%n",location);
    else
      System.out.printf("Found 5 at the element % in arr%n",location);

    location = Arrays.binarySearch(arr, 33);
    if(location >=0)
      System.out.printf("Found 33 at the element % in arr%n",
    location);
    else
      System.out.printf("Found 33 at the element % in arr%n",
    location);
  }

  public static void displayArray(int[] array, String description){
    System.out.printf("%n%s: ", description);

    for (int value : array)
    System.out.printf("%d ", value);
    }
}

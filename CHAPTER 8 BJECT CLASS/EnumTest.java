
import java.util.EnumSet;

public class EnumTest {
  public static void main(String[] args){
    System.out.println("All books: ");

    // print all the books in enum 
    for(Book book : Book.values())
      System.out.printf("%-10s%-55s%s%n",book,book.getTitle(),book.getCopyrightYear());
    System.out.printf("%nDisplay a range of enum constants: %n");

    for (Book book: EnumSet.range(Book.JHPT, Book.CPPHPT))
      System.out.printf("%-10s%-4s%s%n",book,book.getTitle(),book.getCopyrightYear());
  }
}

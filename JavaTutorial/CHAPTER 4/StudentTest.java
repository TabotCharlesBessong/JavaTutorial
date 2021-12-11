public class StudentTest {
  public static void main(String[] args){
    Students account1 = new Students("Jack Bauer", 86);
    Students account2 = new Students("Micheal Jackson", 68);

    System.out.printf("%s 's letter grade is : %s%n",account1.getName() , account1.getLetterGrade());

    System.out.printf("%s 's letter grade is : %s%n",account2.getName()
    , account2.getLetterGrade());
  }
}

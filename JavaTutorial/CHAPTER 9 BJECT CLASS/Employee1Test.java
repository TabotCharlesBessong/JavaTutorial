public class Employee1Test {
  public static void main(String[] args){
    System.out.printf("Employee before instantiation: %d%n",Employee1.getCount());

    Employee1 e1 = new Employee1("Susan","Baker");
    Employee1 e2 = new Employee1("John","Doe");
    Employee1 e3 = new Employee1("Yimnai","Nerus");
    Employee1 e4 = new Employee1("Charles","Tabot");

    System.out.printf("%nEmployees after instantiation:%n");
    System.out.printf("via e1.getCount(): %d%n",e1.getCount());
    System.out.printf("via e2.getCount(): %d%n",e2.getCount());
    System.out.printf("via e1.getCount(): %d%n",e3.getCount());
    System.out.printf("via e2.getCount(): %d%n",e4.getCount());
    System.out.printf("via Employee1.getCount(): %d%n",Employee1.getCount());

    System.out.printf("%nEmployee 1: %s %s%nEmployee 2: %s %s%nEmployee 3: %s %s%nEmployee 4: %s %s%n",e1.getFirstName(),e1.getLastName(),
    e2.getFirstName(),e2.getLastName(),
    e3.getFirstName(),e3.getLastName(),
    e4.getFirstName(),e4.getLastName());
  }
}

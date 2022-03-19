public class PayrollSystemTest {
  public static void main(String[] args){
    SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smilga", "111-11-1111", 800);
    HourlyEmployee hourlyEmployee = new HourlyEmployee("Nickolas", "Sarkozy", "222-22-2222", 22.5, 38);
    HourlyEmployee hourlyEmployee1 = new HourlyEmployee
   ("Francois", "Miteran", "333-33-3333", 31.5, 58);

   System.out.println("Employee Salaries Processed Individually: ");

   System.out.printf("%n%s%n%s: $%,.2f%n%n",salariedEmployee , "earned",salariedEmployee.earnings());
   System.out.printf("%s%n%s: $%,.2f%n%n",hourlyEmployee ,"earned",hourlyEmployee.earnings());
   System.out.printf("%s%n%s: $%,.2f%n%n",hourlyEmployee1 ,"earned",hourlyEmployee1.earnings());

   Employee[] employees = new Employee[3];

   employees[0] = salariedEmployee;
   employees[1] = hourlyEmployee;
   employees[2] = hourlyEmployee1;

   System.out.printf("Employee Salaries processes polymorphically:%n%n");

  for(int j = 0;j<employees.length;j++)
    System.out.printf("Employee %d  is a %s%n" , j , employees[j].getClass().getName());
  }
}

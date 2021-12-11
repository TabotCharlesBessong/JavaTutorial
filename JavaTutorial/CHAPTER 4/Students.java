public class Students {
  private String name;
  private double average;

  public Students(String name,double average){
    this.name = name;
    if(average > 0.0)
      if(average <= 100)
        this.average = average;
    
  }
  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return name;
  }

  public void setAverage(double studentAverage){
    if(average > 0.0)
      if(average <= 100)
        this.average = average;
  }
  public double getAverage(){
    return average;
  }
  public String getLetterGrade(){
    String letterGrade = "";
    if(average >= 80)
      letterGrade = "A";
    else if(average >= 70)
      letterGrade  = "B+";
    else if(average >= 60)
      letterGrade = "B";
    else if(average >= 55)
      letterGrade = "C+";
    else if(average >= 50)
      letterGrade = "C";
    else 
      letterGrade = "F";
    
    return letterGrade;
  }
}

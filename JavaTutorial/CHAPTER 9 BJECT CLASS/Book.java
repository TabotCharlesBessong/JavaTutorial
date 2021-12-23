public enum Book {
  JHPT("Java how to program","2015"),
  CHPT("C how to program","2013"),
  IW3HPT("Internet and the world wide web how to program","2012"),
  VBHPT("Visual Basic how to program","2014"),
  CPPHPT("C++ how to program","2014"),
  CSHARPHPT("C# how to program","2014");

  private final String title; // book title
  private final String copyrightYear; // copyright year

  // enum constructor
  Book(String title, String copyrightYear)
  {
  this.title = title;
  this.copyrightYear = copyrightYear;
  }

  // accessor for field title
  public String getTitle()
  {
  return title;
  }

  // accessor for field copyrightYear
  public String getCopyrightYear()
  {
  return copyrightYear;
  }
}



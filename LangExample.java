/**
There are 3 online courses available Python, Data Structures and Java for an online course. Create an interface OnlineCourse having method getDetails().Using factory design pattern return the OS specific details.
*/

interface OnlineCourse
{
  void getDetails();
}
class Python implements OnlineCourse
{
  public void getDetails()
  {
    System.out.println("Using python3");
  }
}
class Data_Structure implements OnlineCourse
{
  public void getDetails()
  {
    System.out.println("Using g++");
  }
}
class Java implements OnlineCourse
{
  public void getDetails()
  {
    System.out.println("Using jdk");
  }
}
class LangFactory
{
  public OnlineCourse getDetails(String str)
  {
    if(str=="Using g++")
    return new Data_Structure();
    
    else if(str=="Using jdk")
    return new Java();
    
    else
    return new Python();
  }
}
class LangExample
{
  public static void main(String [] args)
  {
    LangFactory lf=new LangFactory();
    OnlineCourse obj=lf.getDetails("Using g++");
    obj.getDetails();
  }
}

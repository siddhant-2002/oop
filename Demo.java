/**
Consider a class Student having data members name, marks of three subjects, average and member function printDetails(). Take input of 3 students from user using array of objects and print it.
*/
import java.util.*;
class Student
{
  String name;
  int marks1;
  int marks2;
  int marks3;
  float avg;
  Student(String n,int m1,int m2,int m3)
  {
    this.name = n;
    this.marks1 = m1;
    this.marks2 = m2;
    this.marks3 = m3;
  }
  void printDetails()
  {
    System.out.println("Name is :"+name);
    System.out.println("Sub1 marks is :"+marks1);
    System.out.println("Sub2 marks is :"+marks2);
    System.out.println("Sub3 marks is :"+marks3);
    
    float avg=(marks1+marks2+marks3)/3;
    System.out.println("Avg% is :"+avg+"%");
  }
}
class Demo
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no of student");
    int q=sc.nextInt();
    
    Student [] arr= new Student[q];  
    for(int j=0;j<q;j++)
    {
      System.out.println("Enter name");
      String a=sc.next();
      System.out.println("Enter sub1 marks");
      int i=sc.nextInt();
      System.out.println("Enter sub2 marks");
      int x=sc.nextInt();
      System.out.println("Enter sub3 marks");
      int y=sc.nextInt();
  
      arr[j] = new Student(a,i,x,y);
      arr[j].printDetails();
    } 
  }
}

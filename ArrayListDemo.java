import java.util.*;
class ArrayListDemo
{
  public static void main(String [] args)
  {
    ArrayList <Integer> obj1=new ArrayList <> ();
    obj1.add(5);
    obj1.add(6);
    obj1.add(4);
    obj1.add(8);
    obj1.add(7);
    System.out.println("Output add "+obj1);
    
    System.out.println("Size is "+obj1.size());
    
    obj1.set(2,30);
    System.out.println("Output set "+obj1);
    
    obj1.remove(2);
    System.out.println("Output remove "+obj1);
    
    obj1.clone();
    System.out.println("Output clone "+obj1);
    
    obj1.clear();
    System.out.println("Output clear "+obj1);
    
    System.out.println("Size is "+obj1.size());
    
    
    System.out.println("*****************************************");
    //Demo 2
    ArrayList <String> obj2=new ArrayList <> ();
    obj2.add("Kiran");
    obj2.add("Sagar");
    obj2.add("Shivanand");
    obj2.add("Ramesh");
    obj2.add("Anil");
    System.out.println("Output add "+obj2);
    
    System.out.println("Size is "+obj2.size());
    
    obj2.set(2,"Samir");
    System.out.println("Output set "+obj2);
    
    obj2.remove(2);
    System.out.println("Output remove "+obj2);
    
    obj2.clone();
    System.out.println("Output clone "+obj2);
    
    obj2.clear();
    System.out.println("Output clear "+obj2);
    
    System.out.println("Size is "+obj2.size());
  }
}

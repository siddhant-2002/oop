import java.util.*;
class LinkedListDemo
{
  public static void main(String [] args)
  {
    LinkedList <Integer> obj=new LinkedList <> ();
    obj.add(5);
    obj.add(6);
    obj.add(4);
    obj.add(8);
    obj.add(7);
    System.out.println("Output add "+obj);
    
    System.out.println("Size is "+obj.size());
    
    obj.set(2,30);
    System.out.println("Output set "+obj);
    
    obj.remove(2);
    System.out.println("Output remove "+obj);
    
    obj.clone();
    System.out.println("Output clone "+obj);
    
    obj.clear();
    System.out.println("Output clear "+obj);
    
    System.out.println("Size is "+obj.size());
  }
}

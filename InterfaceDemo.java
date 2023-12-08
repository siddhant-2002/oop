/* Program on:Design and develop a context for given case study and implement an interface for Vehicles
Consider the example of vehicles like bicycle, car, and bike. All Vehicles have common
functionalities such as Gear Change, Speed up and apply breaks . Make an interface and put all
these common functionalities. Bicycle, Bike, Car classes should be implemented for all these
functionalities in their own class in their own way */


interface Vehicle
{
  void changeGear(int x);
  void speedUp(int y);
  void applyBreaks(int z);

}
class Bicycle implements Vehicle
{
  int speed,gear;
  public void changeGear(int newgear)
  {
      gear=newgear;
  }
  public void speedUp(int increment)
  {
      speed=speed+increment;
  }
  public void applyBreaks(int decrement)
  {
      speed=speed-decrement;
  } 
  public void printState()
  {
      System.out.println("Speed:" +speed+ "Gear:"+gear);
  }
}
class Bike implements Vehicle
{
  int speed,gear;
  public void changeGear(int newgear)
  {
      gear=newgear;
  }
  public void speedUp(int increment)
  {
      speed=speed+increment;
  }
  public void applyBreaks(int decrement)
  {
      speed=speed-decrement;
  } 
  public void printState()
  {
      System.out.println("Speed:" +speed+ "Gear:"+gear);
  }
}
class Car implements Vehicle
{
  int speed,gear;
  public void changeGear(int newgear)
  {
      gear=newgear;
  }
  public void speedUp(int increment)
  {
      speed=speed+increment;
  }
  public void applyBreaks(int decrement)
  {
      speed=speed-decrement;
  } 
  public void printState()
  {
      System.out.println("Speed:" +speed+ "Gear:"+gear);
  }

}
class InterfaceDemo
{

   public static void main(String [] args)
   {
      Bicycle b1=new Bicycle();
      b1.changeGear(2);
      b1.speedUp(10);
      b1.applyBreaks(1);

      System.out.println("Bicycle Present State:");
      b1.printState();
  
      Bike b2=new Bike();
      b2.changeGear(6);
      b2.speedUp(7);
      b2.applyBreaks(2);
    
      System.out.println("Bike Present State:");
      b2.printState();

      Car c=new Car();
      c.changeGear(4);
      c.speedUp(8);
      c.applyBreaks(2);
    
      System.out.println("Car Present State:");
      c.printState();
     
   }
}

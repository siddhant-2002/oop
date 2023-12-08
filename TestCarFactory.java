
interface Car
{

	void spec();

}
class HatchBack implements Car
{

	public void spec()
	{
		System.out.println("HatchBack: Easy to maintain");


	}



}

class Sedan implements Car
{

	public void spec()
	{
		System.out.println("Sedan: Most efficient");


	}



}
class SUV implements Car
{

	public void spec()
	{
		System.out.println("SUV:High Street Presence");


	}



}
class CarFactory
{
	public Car getinstance(String str)
	{
		if(str.equals("Small"))
		{
			return new HatchBack();


		}
		else if(str.equals("Medium Size"))
		{
			return new Sedan();


		}
		else if(str.equals("Large"))
		{
			return new SUV();


		}
		
   		throw new IllegalArgumentException("No such CAR");


		

	}

   
}
class TestCarFactory
{
	public static void main(String[]args)
	{
		CarFactory cf=new CarFactory();
		Car o=cf.getinstance("Medium Size");
		o.spec();
		Car o2=cf.getinstance("Should fly");
		o2.spec();



	}






}
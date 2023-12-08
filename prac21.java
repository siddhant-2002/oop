/*21) Consider a scenario where Bank is a class that provides functionality to get the rate of interest. However, the rate of
interest varies according to banks. For example, SBI, ICICI and AXIS banks could provide 8%, 7%, and 9% rate of interest.*/

class Bank{
	double getRateOfInterest(){return 0;};
}
class SBI extends Bank{
	double getRateOfInterest(){return 8;};
}
class ICICI extends Bank{
	double getRateOfInterest(){return 7;};
}
class AXIS extends Bank{
	double getRateOfInterest(){return 9;};
}

class prac21{
	public static void main(String []args){
		Bank b;
		b=new SBI();
		System.out.println("Interest rate of SBI is "+b.getRateOfInterest()+"%");
		b=new ICICI();
		System.out.println("Interest rate of ICICI is "+b.getRateOfInterest()+"%");
		b=new AXIS();
		System.out.println("Interest rate of AXIS is "+b.getRateOfInterest()+"%");
	}
}
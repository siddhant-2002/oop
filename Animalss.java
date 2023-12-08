/*Create a class Animal having three data members eats, noOfLegs, isVeg.Based on requirement create setter-getter methods for each
member. Class Cat extends Animal, this class also contains data member skin colour, make use of super keyword and print all the
four values.*/
import java.util.*;
class Animal{
	String eats;
	int noOfLegs;
	String isVeg;
	void setEat(String s){
		this.eats=s;
	}
	void setNoOfLegs(int a){
		this.noOfLegs=a;
	}
	void setIsVeg(String b){
		this.isVeg=b;
	}
	String getEat(){
		return this.eats;
	}
	int getNoOfLegs(){
		return this.noOfLegs;
	}
	String getIsVeg(){
		return this.isVeg;
	}
}

class Cat extends Animal{
	String skin_color;
	Cat(String e,int no,String v,String c){
		super.setEat(e);
		super.setNoOfLegs(no);
		super.setIsVeg(v);
		this.setSkin_color(c);
	}
	void setSkin_color(String s){
			this.skin_color=s;
	}
	String getSkin_color(){
			return this.skin_color;
	}

	void display(){
		System.out.println("Information of cat:");
		System.out.println("Eats :"+super.getEat());
		System.out.println("No. of Legs :"+super.getNoOfLegs());
		System.out.println("Vegetarian :"+super.getIsVeg());
		System.out.println("Skin Color :"+this.getSkin_color());
	}
}

class Animalss{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("no. of legs,Enter Eats,isVeg & color of cat respectively");

		int no=sc.nextInt();
		sc.nextLine();
		String e=sc.nextLine();
		String v=sc.nextLine();
		String c=sc.nextLine();
		Cat cat=new Cat(e,no,v,c);

		cat.display();

	}
}
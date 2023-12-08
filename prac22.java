/*22) Create a class Student having abstract member functions to get name, SSC marks, HSC marks, create 3 classes Harish, Jayant and
Vijay who extend Student class and implement the abstract methods and print the student details. */
import java.util.*;
abstract class Student{
	String name="";
	Double ssc=0.0,hsc=0.0;
	Scanner sc;

	abstract void getName();
	abstract void getSscMarks();
	abstract void getHscMarks();

	public void display(){
		System.out.println("----------- Information -----------");
		System.out.println("Name : "+this.name);
		System.out.println("Ssc marks : "+this.ssc);
		System.out.println("Hsc marks : "+this.hsc);
		System.out.println("-----------------------------------");
	}
}

class Jayant extends Student{
	Jayant(Scanner s){
		sc=s;
	}
	public void getName(){
		System.out.println("Enter name");
		this.name=sc.nextLine();
	}
	public void getSscMarks(){
		System.out.println("Enter ssc marks");
		this.ssc=sc.nextDouble();
	}
	public void getHscMarks(){
		System.out.println("Enter hsc marks");
		this.hsc=sc.nextDouble();
	}

}
class Harish extends Student{
	Harish(Scanner s){
		sc=s;
	}
	public void getName(){
		System.out.println("Enter name");
		this.name=sc.nextLine();
	}
	public void getSscMarks(){
		System.out.println("Enter ssc marks");
		this.ssc=sc.nextDouble();
	}
	public void getHscMarks(){
		System.out.println("Enter hsc marks");
		this.hsc=sc.nextDouble();
	}
}
class Vijay extends Student{
	Vijay(Scanner s){
		sc=s;
	}
	public void getName(){
		System.out.println("Enter name");
		this.name=sc.nextLine();
	}
	public void getSscMarks(){
		System.out.println("Enter ssc marks");
		this.ssc=sc.nextDouble();
	}
	public void getHscMarks(){
		System.out.println("Enter hsc marks");
		this.hsc=sc.nextDouble();
	}
}

class prac22{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		Jayant j=new Jayant(sc);
		j.getName();
		j.getSscMarks();
		j.getHscMarks();
		j.display();

		sc.nextLine();
		Harish h=new Harish(sc);
		h.getName();
		h.getSscMarks();
		h.getHscMarks();
		h.display();

		sc.nextLine();
		Vijay v=new Vijay(sc);
		v.getName();
		v.getSscMarks();
		v.getHscMarks();
		v.display();
	}
}
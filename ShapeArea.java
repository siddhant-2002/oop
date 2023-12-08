/*24. Interface Area is having method calculateArea().Calculate the area for the following classes Square, Circle,
Triangle, Rectangle */

import java.util.*;
interface Area{
	abstract void calculateArea();
}

class Square implements Area{
	float l;
	Square(float l){
		this.l=l;
	}
	public void calculateArea(){
		System.out.println("Area of Sqaure = "+(l*l));
	}
}

class Circle implements Area{
	float r;
	Circle(float r){
		this.r=r;
	}
	public void calculateArea(){
		System.out.println("Area of Circle = "+(2*Math.PI*r*r));
	}
}

class Triangle implements Area{
	float l,h;
	Triangle(float l,float h){
		this.l=l;
		this.h=h;
	}
	public void calculateArea(){
		System.out.println("Area of Triangle = "+(0.5*l*h));
	}
}

class Rectangle implements Area{
	float l,b;
	Rectangle(float l,float b){
			this.l=l;
			this.b=b;
	}
	public void calculateArea(){
		System.out.println("Area of Rectangle = "+(l*b));
	}
}

class ShapeArea{
	public static void main(String []args){
		int ch;
		Area a;
		Scanner sc=new Scanner(System.in);
		do{
			System.out.println("-----------Area Calculator-----------");
			System.out.println("\n1.Area of Square\n2.Area of Circle\n3.Area of Triangle\n4.Area of Rectangle\n5.Exit");
			System.out.println("\nEnter your choice");
			ch=sc.nextInt();
			switch(ch){
				case 1:
					float l;
					System.out.println("\nEnter length of Square");
					l=sc.nextFloat();
					a=new Square(l);
					a.calculateArea();
					break;
				case 2:
				    float r;
				    System.out.println("\nEnter radius of Circle");
					r=sc.nextFloat();
					a=new Circle(r);
					a.calculateArea();
					break;
				case 3:
					float x,y;
					System.out.println("\nEnter length of Triangle");
					x=sc.nextFloat();
					System.out.println("\nEnter height of Triangle");
					y=sc.nextFloat();
					a=new Triangle(x,y);
					a.calculateArea();
					break;
				case 4:
					float c,d;
					System.out.println("\nEnter length of Rectangle");
					c=sc.nextFloat();
					System.out.println("\nEnter breadth of Rectangle");
					d=sc.nextFloat();
					a=new Rectangle(c,d);
					a.calculateArea();
					break;
				case 5:break;
				default:System.out.println("\nEnter valid choice!!");
			}
		}while(ch!=5);
	}
}
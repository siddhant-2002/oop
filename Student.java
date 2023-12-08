/**Define a class student with four data members such as name, roll no, sub1 and sub2. Define appropriate methods to INITITALIZE AND DISPLAY VALUES OF DATA MEMBERS also calculate total marks and percentage scored by student in three subjects.*/

class Student
{
	String name;
	int roll;
	int m1;
	int m2;
	Student(String n,int r,int m3,int m4)
	{
		this.name=n;
		this.roll=r;
		this.m1=m3;
		this.m2=m4;
	}
	void display()
	{
		System.out.println("Name is :"+name);
		System.out.println("Roll is :"+roll);
		System.out.println("Sub1 marks is :"+m1);
		System.out.println("Sub2 marks is :"+m2);
		int total=m1+m2;
		System.out.println("Total marks are :"+total);
		float per=(m1+m2)/2;
		System.out.println("Total percentage :"+per+"%");
	}
	public static void main(String [] args)
	{
		Student s=new Student("ABC",1,70,80);
		s.display();
	}
}

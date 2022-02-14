package inheritence;
import java.util.*;
class A
{
	int studId;
	String name;
	Scanner sc=new Scanner(System.in);
	public void input1()
	{
		System.out.println("Enter Student Id:");
		studId=sc.nextInt();
		System.out.println("Enter Student name:");
		name=sc.next();
	}
	public void show1()
	{
		System.out.println("Student Id is:"+studId);
		System.out.println("Student name is:"+name);
	}
}
class B extends A
{
	String address;
	String qua;
	Scanner sc=new Scanner(System.in);
	public void input2()
	{
		System.out.println("Enter address:");
		address=sc.next();
		System.out.println("Enter Qualification:");
		qua=sc.next();
	}
	public void show2()
	{
		System.out.println("Student address is:"+address);
		System.out.println("Student qualification is:"+qua);
	}
}

public class SingleInheritance1 
{

	public static void main(String[] args) 
	{
		B b1=new B();
		b1.input1();
		b1.input2();
		
		b1.show1();
		b1.show2();
	}

}

//This is Rough Program
package Arguments;
class V 
{

int a,b; //States or Fields or Instance variables or data members
void print() //Behaviour or member functions 
	{

		System.out.println("The value of a is "+a+" b is "+b);

	}

}
class K 
{

	double c,d;
	//By Intilizing through method
	public void set(double a,double b) 
	{

		c=a;
		d=b;

}
void print() //Behaviour or member functions 
{

	System.out.println("The value of c is "+c+" d is "+d);

}

}

public class PassingArguments 
{

	public static void main(String[] args) 
	{
		V t2=new V();
		V t3=new V();
		t2.a=20;
		t2.b=100;
		t2.print();

		V t1=new V(); // Creating an object
		t1.a=100;
		t1.b=200; //By reference variable
		t1.print();

		K a1=new K();
		a1.set(100.78, 200.89);
		a1.print();
	}

}

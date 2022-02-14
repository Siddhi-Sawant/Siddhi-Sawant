package Oops;

public class Demo 
{
	int a,b,c; 
	public void add(int a , int b)
	{
		
		c=a+b;
		System.out.println("Addition "+c);
	}
	
	public int add1(int c,int  d)
	{
		return c+d;
		
	}
	
	public static void show()
	{
		System.out.println("Welcome");
	}

	public static void main(String[] args) 
	{
		Demo obj=new Demo();
		obj.add(4,6);
		//obj.a=3;
		//obj.b=5;
		Demo obj1=new Demo();
		System.out.println("Add "+obj1.add1(10,20));
		
		Demo.show();

	}

}

package inheritence;
class sem1
{
	private int math,eng,science;
	public void input1()
	{
		math=55;
		eng=60;
		science=70;
	}
	public void output1()
	{
		System.out.println("---------------Semester-1--------------");
	
		System.out.println("Marks in Mathematics:"+math);
		System.out.println("Marks in English:"+eng);
		System.out.println("Marks in Science:"+science);
	}
}
class sem2 extends sem1
{
	private int c,cpp,java;
	public void input2()
	{
		c=51;
		cpp=65;
		java=77;
	}
	public void output2()
	{
		System.out.println("\n\n------------------Semester-2---------------");
		System.out.println("Marks in C-Language:"+c);
		System.out.println("Marks in CPP:"+cpp);
		System.out.println("Marks in Java:"+java);
	}
}
public class SingleInheritance 
{

	public static void main(String[] args)
	{
		sem2 obj=new sem2();
		obj.input1();
		obj.input2();
		
		obj.output1();
		obj.output2();

	}

}

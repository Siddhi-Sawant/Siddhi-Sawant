package inheritence;
class Sem11
{
	
	int math,c,cpp;
	void input()
	{
		math=50;
		c=60;
		cpp=70;
	}
	public void output()
	{
		System.out.println("\t Result of semester:1");
		System.out.println("\nMarks in Mathematics:"+math);
		System.out.println("Marks in C-language:"+c);
		System.out.println("Marks in CPP:"+cpp);
		System.out.println("\n-----------------------------------");
	}
}
class Sem22 extends Sem11
{
	int java,bdms,eng;
	
	
	public void input2()
	{
		java=55;
		bdms=88;
		eng=65;
		
	}
	public void output2()
	{
		System.out.println("\t Result of semester:2");
		System.out.println("\nMarks in Java:"+java);
		System.out.println("Marks in BDMS:"+bdms);
		System.out.println("Marks in english:"+eng);
		System.out.println("\n---------------------------------------");
	}
}
class Sem33 extends Sem22
{
	private int ml,cc,sa;
	public void input3()
	{
		ml=4;
		cc=5;
		sa=6;
	}
	public void output3()
	{
		System.out.println("\t Result of semester:3");
		System.out.println("\nMarks in ml:"+ml);
		System.out.println("Marks in cc:"+cc);
		System.out.println("Marks in sa:"+sa);
	}
}
public class Multipleinheritance 
{

	public static void main(String[] args) 
	{
		Sem33 obj= new Sem33();
		obj.input();
		obj.input2();
		obj.input3();
		
		obj.output();
		obj.output2();
		obj.output3();
		
	}

}

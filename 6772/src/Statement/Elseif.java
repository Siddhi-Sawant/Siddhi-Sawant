package Statement;
import java.util.Scanner;

public class Elseif 
{

	public static void main(String[] args) 
	{
		int marks;
		System.out.println("Enter your marks");
		Scanner in=new Scanner(System.in);
		marks=in.nextInt();
		if(marks>=36)
		{
			System.out.println("You are pass");
		}
		else
		{
			System.out.println("You are fail");
		}
			
	}

}

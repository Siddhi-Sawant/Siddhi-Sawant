package Statement;
import java.util.Scanner;

public class Switch
{

	public static void main(String[] args) 
	{
		int days;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter any day of week:");
		System.out.println("Press  0 to 6 for printing any daya ");
		System.out.println("Press 0 for Monday ");
	
		days=in.nextInt();
		switch(days)
		{
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Sunday");
			break;
		default:
			  
			System.out.println("Wrong Input  you can ");
		}
		
		
	}

}

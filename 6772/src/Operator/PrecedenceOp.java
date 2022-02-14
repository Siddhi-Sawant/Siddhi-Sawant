package Operator;

public class PrecedenceOp 
{

	public static void main(String[] args) 
	{
		int a=5,b=12,c=8,d=10,cal;
		
		cal= d++*2+c++/a;
		/*
		 * 10*2+8/5;
		 * 20+8/5;
		 * 20+1.6;
		 * 21.6=21;*/
		System.out.println(cal);
		/*
		 * cal=a+(b*d)/c;
		 * cal=5+(12*10)/8;
		 * cal=5+120/8;
		 * 		=5+15;
		 * 		=20;
		 * cal=d/a*c-b;
		 * 		=10/5*8-12;
		 * 		=2*8-12;
		 * 		=16-12;
		 * 		=4;*/
	}
}


package Statement;

public class Return 
{
	public int show(int c,int d)
	{
		return c+d;
	}

	public static void main(String[] args)
	{
		Return obj=new Return();
		System.out.println(" "+obj.show(10,20));
		

	}

}

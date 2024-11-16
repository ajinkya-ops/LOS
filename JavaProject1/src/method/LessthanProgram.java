package method;

public class LessthanProgram {
	
	static int minimum(int a, int b)
	{
		if(a<b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	
public static void main(String[]args)
{
	System.out.println(minimum(10,20));
}
}

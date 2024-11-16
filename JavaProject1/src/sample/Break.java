package sample;

public class Break {
public static void main(String []args)
{
	int i;
	for( i= 1; i<=10;i++)
	{
		if(i==5)
			continue;
		System.out.println(i);
	}
	System.out.println("For loop exit value of i is: "+i);
}
}

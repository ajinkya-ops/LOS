package sample;

public class DoWhile {
public static void main(String []args)
{
	int i = 0;
	do
	{
		System.out.println(i);
		i = i+2;
	}
	while(i<=10);
	System.out.println();
	System.out.println("do while loop is end:" +i);
}
}

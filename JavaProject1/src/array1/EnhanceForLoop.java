package array1;

public class EnhanceForLoop {
public static void main(String [] args)
{
	int [] [] a = {{10,20},{40,50},{70,80}};
	
	for(int  []row:a)
	{
		for(int column : row)
		{
			System.out.println(column);		}
	}
}
}

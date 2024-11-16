package starPrograms;

public class AE {
public static void main(String[]args)
{
	for(int i=1;i<=7;i++)
	{
		for(int j =1;j<=4;j++)
		{
			if(j==1 || i==j || i+j==8 )
			{
			System.out.print(" * ");
			}
			else if (i==3 && j==2)
			{
				System.out.print(" * ");
			}
			else if (i==4 && j==2)
			{
				System.out.print(" * ");
			}
			else if(i==4 && j==3)
			{
				System.out.print(" * ");
			}
			else if(i==5 && j==2)
			{
				System.out.print(" * ");
			}
			else
			{
				System.out.print("   ");
			}
			
			
		}
		System.out.println();
	}
}
}

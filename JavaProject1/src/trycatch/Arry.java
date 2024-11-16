package trycatch;

public class Arry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			int a [] = new int [5];
			a[0]= 10;
			System.out.println(a[5]);
		}
		
		catch(ArrayIndexOutOfBoundsException m)
		{
			System.out.println(m.toString());
		}


finally
{
System.out.println("Hello");
}
	}

}

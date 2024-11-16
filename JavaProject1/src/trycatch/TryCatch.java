package trycatch;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
		int result = 100/0;
		}
		
		catch(ArithmeticException e)
		{
		System.out.println(e.toString());
		}
		
		finally
		{
		System.out.println("Hello Java");
		}
	}

}

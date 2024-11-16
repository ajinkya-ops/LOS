package throwandThows;

public class Throww {
	
	static void checkAge(int age) throws ArithmeticException
	{
		if(age < 18)
		{
			throw new ArrayIndexOutOfBoundsException("Access Denied- Age must be at list 18 years");
		}
		
		else
		{
			System.out.println("Access Granted");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			checkAge(15);
		}
		
		catch(Exception a)
		{
			System.out.println(a.toString());
		}


System.out.println("Hello Java");
		
	}

}

package trycatch;

public class X {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try
	{
		String s = null;
		System.out.println(s.length());
	}
	
	catch(NullPointerException a)
	{
		System.out.println(a.toString());
	}


finally
{
System.out.println("hello java");
}
	}

}

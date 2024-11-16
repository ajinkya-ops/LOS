package trycatch;

public class Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			String s = "abc";
			int i = Integer.parseInt(s);
			System.out.println(i);
		}
		
		catch(NumberFormatException v)
		{
			System.out.println(v.toString());
		}
		
		
		
		
		System.out.println("Hello");
	}

}

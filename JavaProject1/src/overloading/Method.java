package overloading;

public class Method {
	
	void mai(int a)
	{
		System.out.println("Value of a is: "+a);
	}
	
	void main(double b)
	{
		System.out.println("Value of b is: "+ b);
	}
	
	void main(int a, int b)
	{
		System.out.println("Value of a is: "+a);
		System.out.println("Value of b is: "+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method obj = new Method();
		
		obj.mai(1);
		obj.main(9.9);
		obj.main(60, 90);
	}

}

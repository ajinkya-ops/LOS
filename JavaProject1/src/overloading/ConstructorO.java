package overloading;

public class ConstructorO {
	
	ConstructorO(int a)
	{
		System.out.println(a);
	}
	
	ConstructorO(double b)
	{
		System.out.println(b);
	}
	
	ConstructorO(double a, double b)
	{
		System.out.println("Value of a is: "+a);
		System.out.println("Value of b is:"+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorO obj1 = new ConstructorO(2);
		ConstructorO obj2 = new ConstructorO(5.5);
		ConstructorO obj3 = new ConstructorO(9.9,9.9);
	}

}

package overloading;

public class Overloading {
	
	void add(int a, int b) //1st method
	{
		System.out.println("1st method: " + (a+b) );
	}
	
	void add(double a,double b) //2nd method
	{
		System.out.println("2st method: " +(a+b));
	}
	
	void add(int a, double b )
	{
		System.out.println("3st method: "+(a+b));
	}
	
	void add(int a, int b, int c)
	{
		System.out.println("4st method: "+(a+b+c));
	}
	
	
	
public static void main(String[] args) {
	Overloading obj = new Overloading();
	
	obj.add(2, 2);
	obj.add(2.2, 2.2);
	obj.add(5, 5.5);
	obj.add(5, 10, 20);
}
}

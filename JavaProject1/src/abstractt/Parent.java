package abstractt;

public abstract class Parent {
	
	Parent() // Constructor
	{
		System.out.println("Namste");
	}
	
	abstract void run(); //Abstract Method
	
	 final void display() //Non Abstract Method
	{
		System.out.println("Hello Rahul");
	}
	
	void print() //Non Abstract Method
	{
		System.out.println("Hello Hari");
	}
	

}

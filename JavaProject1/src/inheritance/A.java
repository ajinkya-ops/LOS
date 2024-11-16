package inheritance;

class Parent
{
	int a;
	void display()
	{
		System.out.println("Class Parent: "+a);
	}
}

class Child extends Parent
{
	int b;
	void print()
	{
		System.out.println("Class Child: "+b);
	}
}
public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child obj1 = new Child();
obj1.a=50;
obj1.b=90;

obj1.display();
obj1.print();
	}

}

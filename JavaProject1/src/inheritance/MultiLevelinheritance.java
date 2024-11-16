package inheritance;

class D //Parent Class
{
	int a1;
	void display()
	{
		System.out.println("Class A: "+a1);
	}
}

class B extends D // class B is the child class of class A
{
	int b1;
	void print()
	{
		System.out.println("Class B: "+b1);
	}
}

class C extends B //Class c is the child class of class B
{
	int c1;
	void printc()
	{
		System.out.println("Class C: "+c1);
	}
}


public class MultiLevelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
C obj = new C();
obj.a1=50;
obj.b1=80;
obj.c1=100;

obj.display();
obj.print();
obj.printc();

System.out.println();

B obj1 = new B();
obj1.a1=101;
obj1.b1= 102;

obj1.display();
obj1.print();

	}

}

package inhe;

class parent
{
	int a;
	void display()
	{
		System.out.println("Class Parent: "+a);
	}
}

class child1 extends parent
{
	int b;
	void print()
	{
		System.out.println("Class Child: "+b);
	}
}

class child2 extends parent
{
	int c;
	void p()
	{
		System.out.println("Class Child2: "+c);
	}
}

public class Hi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
child1 obj = new child1();
obj.a= 50;
obj.b=60;

obj.display();
obj.print();

System.out.println();

child2 obj1 = new child2();
obj1.a=80;
obj1.c= 40;

obj1.display();
obj1.p();
	}

}

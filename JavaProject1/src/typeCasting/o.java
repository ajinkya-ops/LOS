package typeCasting;
class parent
{
	void display()
	
	{
		System.out.println("Money: 6000");
	}
}

class child extends parent
{
	void display()
	{
		System.out.println("Ajinkya");
	}
}
public class o {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
parent o = new child();
o.display();
	}

}

package interfacee;

interface address
{
	void b(String city);
}

interface detail extends address
{
	void shoeDetails(String name, int age);	
	
}

public class Hp implements detail{
	
	public void b(String city)
	{
		System.out.println("City is: "+ city);
	}
	
	public void shoeDetails(String name, int age)
	{
		System.out.println("Name is: "+name);
		System.out.println("Age is: "+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hp obj = new Hp();
		obj.shoeDetails("Rahul", 33);
		obj.b("Kolhapur");

	}

}

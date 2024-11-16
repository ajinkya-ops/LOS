package supper;



class parent
{
	int a = 100;
	
	 
	
	
}

class child extends parent
{
	int a = 200;
	void display()
	{
		
		System.out.println(a);
		System.out.println(super.a);
	}
}



public class Supper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		child obj = new child();
		obj.display();

	}

}

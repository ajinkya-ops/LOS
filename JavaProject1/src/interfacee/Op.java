package interfacee;

interface details
{
	void showDetails(String name, int age); //abstract,public
	int a =10;
}

public class Op implements details{
	
	public void showDetails(String name, int age)
	{
		System.out.println("Name is: "+ name);
		System.out.println("Age is: "+ age);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Op obj = new Op();
		obj.showDetails("Rahul", 33);
		
		System.out.println(a);
		

	}

}

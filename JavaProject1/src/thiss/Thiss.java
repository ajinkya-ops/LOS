package thiss;

public class Thiss {
	
	int a =50;
	
	public void display()
	{
		int a = 60;
		System.out.println(a);
		System.out.println(this.a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thiss obj = new Thiss();
obj.display();
	}

}

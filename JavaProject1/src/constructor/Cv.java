package constructor;

public class Cv {
	
	static int count = 0;
	
	Cv()
	{
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cv obj1 = new Cv();
Cv obj2 = new Cv();
Cv obj3 = new Cv();
	}

}

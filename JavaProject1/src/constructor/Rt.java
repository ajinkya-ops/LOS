package constructor;

public class Rt {

	//attributes
	String car;
	int year;
	
	//Constructor with parameterize
	Rt(String carName, int yr)
	{
		car = carName;
		year = yr;
	}
	
	public static void main(String[]args)
	{
		Rt obj = new Rt("BMW", 2024);
		
		System.out.println(obj.car+" "+obj.year);
		
	}
}

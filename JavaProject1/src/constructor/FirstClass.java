package constructor;

public class FirstClass {

	//attributes
	 String car;
	 int year;
	
	//Constructor with parameters
	private FirstClass(String carName, int yr)
	{
		//initialize attributes
		car = carName;
		year = yr;
	}
	
public static void main(String[] args) {
	FirstClass obj = new FirstClass("BMW",2024);
	System.out.println(obj.car+" "+obj.year);
}
}

package statiC;

public class Static {
	
	int roll;
	String studentName;
	static String collageName = "MIT";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static obj = new Static();
		obj.roll = 101;
		obj.studentName="Ajinkya";
		
		Static obj1 = new Static();
		obj1.roll = 102;
		obj1.studentName="Rajesh";
		
		
		
		System.out.println(obj.roll+", "+obj.studentName+", "+obj.collageName);
		System.out.println(obj1.roll+", "+obj1.studentName+", "+obj1.collageName);
	}

}

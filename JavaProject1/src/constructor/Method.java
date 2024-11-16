package constructor;

public class Method {
	
	int roll;
	String studentName;
	static String collageName ="MIT";
	
	Method(int rollNo, String student)
	{
		roll = rollNo;
		studentName =student;
	}
	
	void r()
	{
		System.out.println(roll+", "+studentName+", "+ collageName);
	}
	
	static void change()
	{
		collageName ="DYP";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Method obj1 = new Method(101,"Priyanka");
Method obj2 = new Method(102,"Rahul");
obj1.r();
obj2.r();

change();
System.out.println();

obj1.r();
obj2.r();

	}

}

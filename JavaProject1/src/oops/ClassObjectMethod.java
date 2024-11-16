package oops;

public class ClassObjectMethod {
	
	int employID;
	String employName;
	String job;
	int salary;
	
	void diplay()
	{
		System.out.println(employID);
		System.out.println(employName);
		System.out.println(job);
		System.out.println(salary);
	}
	
	
public static void main(String []areg)
{
	ClassObjectMethod emp1 = new ClassObjectMethod();
	emp1.employID = 101;
	emp1.employName = "Hari";
	emp1.job = "Manager";
	emp1.salary = 70000;
	
	
	ClassObjectMethod emp2 = new ClassObjectMethod();
	emp2.employID = 102;
	emp2.employName = "Sandesh";
	emp2.job = "Devloper";
	emp2.salary = 80000;
	
	ClassObjectMethod emp3 = new ClassObjectMethod();
	emp3.employID = 103;
	emp3.employName = "Ramesh";
	emp3.job = "QA";
	emp3.salary = 90000;
	
	emp1.diplay();
	System.out.println();
	
	emp2.diplay();
	System.out.println();
	
	emp3.diplay();
	
}
}

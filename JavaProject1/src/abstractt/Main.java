package abstractt;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent obj1 = new Child1();
		obj1.display();
		obj1.print();
		obj1.run();
		
		System.out.println();
		
		obj1 = new Child2();
		obj1.display();
		obj1.print();
		obj1.run();
		
	}

}

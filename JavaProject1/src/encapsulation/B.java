package encapsulation;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A obj1 = new A();
		
		obj1.setAccountNo(101);
		obj1.setName("Sham");
		obj1.setAmount(60000);
		
		System.out.println("Account No: "+ obj1.getAccountNo());
		System.out.println("Name: "+obj1.getName());
		System.out.println("Amount: "+obj1.getAmount());
		
	}

}

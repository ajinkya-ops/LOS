package overriding;

class Bank
{
	 double gateRateofintrest()
	{
		return(0.1);
	}
}

class BankOfIndia extends Bank
{
	 double gateRateofintrest()
	{
		return 5.0;
	}
}

class Axis extends Bank
{
	double gateRateofintrest()
	{
		return 10.0;
	}
	
}

class SBI extends Bank
{
	double gateRateofintrest()
	{
		return 11.0;
	}
}



public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankOfIndia obj1 = new BankOfIndia();
		System.out.println("Bank Of India ROI : "+obj1.gateRateofintrest());
		
		Axis obj2 = new Axis();
		double v = obj2.gateRateofintrest();
		System.out.println("Axis Bank ROI: "+v);
		
		SBI obj3 = new SBI();
		System.out.println("SBI ROI:"+ obj3.gateRateofintrest());
		
	}

}

package inteviwePrograms;

public class CountEvenAndOddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num = 1234;
int evenCount = 0;
int oddCount = 0;

while(num>0) //1234  123  12  1
{
	//here % modular division operator will give you the last digit of a number.
	int rem=num%10;//4  3  2  1

	
	if(rem%2==0)
	{
		evenCount++;//1 2
	}
	else
	{
		oddCount++;	//1  2
	}
	
	num=num/10;//123 12 1 0
}

System.out.println("Number of Even Numbers: "+evenCount);
System.out.println("Number of Odd Numbers: "+oddCount);
	}

}

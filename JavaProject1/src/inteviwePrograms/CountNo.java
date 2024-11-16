package inteviwePrograms;

public class CountNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num = 123456;
int count =0;

while(num>0)
{
	num=num/10;//every time the number is divided by 10 and rest of the number is stored into the num
	count++;
}
System.out.println("Number of digits in a number: "+count);
	}

}

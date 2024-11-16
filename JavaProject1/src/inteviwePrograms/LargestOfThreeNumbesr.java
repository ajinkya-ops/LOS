package inteviwePrograms;

import java.util.Scanner;

public class LargestOfThreeNumbesr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
Scanner sc = new Scanner(System.in);

System.out.println("Enter First No.");
int a =sc.nextInt();

System.out.println("Enter Second No.");
int b =sc.nextInt();

System.out.println("Enter Thired No.");
int c =sc.nextInt();

//Logic 1:-
/* if(a>b && a>c)
{
	System.out.println(a+ " :a is a Largest Number");
}
else if(b>a && b>c)
{
	System.out.println(b+" :b is Largest Number");
}
else
{
	System.out.println(c+" :c is Largest Number");
}*/

//Logic 2: -
int largest1 = a > b ? a : b; //Largest of a & b
int largest2 = c > largest1 ? c : largest1; //largest of c & largest1

System.out.println(largest2 + " : is Largest Number ");


	}

}

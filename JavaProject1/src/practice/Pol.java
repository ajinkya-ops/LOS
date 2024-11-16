package practice;

import java.util.Scanner;

import org.checkerframework.checker.units.qual.degrees;

public class Pol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter a number: ");

Scanner a = new Scanner(System.in);
int b = a.nextInt();

StringBuilder c = new StringBuilder();
c.append(b);
StringBuilder r = c.reverse();
System.out.println(r);
	}

}

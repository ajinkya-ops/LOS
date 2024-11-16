package inteviwePrograms;

import java.util.Scanner;

public class PalendromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Enter a String: ");
		Scanner sc = new Scanner(System.in);
		
		String str =sc.nextLine();
		String org_str = str ;
		
		String rev ="";
		
		int len= str.length();
		
		for(int i=len-1; i>=0; i--)
		{
			rev = rev +str.charAt(i) ;
		}
		
		if(org_str.equals(rev))
		{
			System.out.println(org_str +" Is Palindrom String");
		}
		else
		{
			System.out.println(org_str +" Is Not Palindrom String");	
		}
		



	}

}

package array1;

public class Array {
public static void main(String [] args)
{
	int [] roll = new int [5];//declare and instantiation
	
	//insert value into array
	roll [0] = 10;
	roll [1] = 20;
	roll [2] = 30;
	roll [3] = 40;
	roll [4] = 50;
	
	//for loop
	for(int i=0; i<roll.length; i++)
	{
		System.out.println(roll[i]);
	}
	
	//print size of an Array
	/*System.out.println("Size of Array: "+roll.length);
	System.out.println();
	
	//read the values from an array
	System.out.println("Value of 0nd index: "+roll[0]);
	System.out.println();
	
	System.out.println("Value of 1nd index: "+roll[1]);
	System.out.println();
	
	System.out.println("Value of 2nd index: "+roll[2]);
	System.out.println();
	
	System.out.println("Value of 3nd index: "+roll[3]);
	System.out.println();
	
	System.out.println("Value of 4nd index: "+roll[4]);*/
	
			}
}

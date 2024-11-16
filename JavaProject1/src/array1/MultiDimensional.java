package array1;

public class MultiDimensional {
public static void main(String []args)
{
	int [][] a = new int[3][2];
	
	a[0][0] = 10;
	a[0][1] = 20;
	
	a[1][0] = 30;
	a[1][1] = 40;
	
	a[2][0] = 50;
	a[2][1] = 60;
	
	System.out.println("Number of Rows: "+a.length);
	System.out.println("Number of Columns: "+a[0].length);
}
}

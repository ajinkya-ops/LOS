package array1;

public class M2 {
public static void main(String []args)
{
	int [][]a = {{1,2,3},{4,5,6},{7,8,9}};
	
	System.out.println("Number of Rows: "+a.length);
	System.out.println("Number of Columns:"+a[0].length);
	
	for(int i =0; i<a.length;i++ )
	{
		for(int j= 0; j<a[0].length; j++)
		{
			System.out.println(a[i][j]);
		}
	}
	
}
}

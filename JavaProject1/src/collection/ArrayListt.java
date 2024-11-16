package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList obj = new ArrayList(); // ArrayList is an implementation class

		//List al = new ArrayList(); we can declare ArrayList in this way also


		obj.add("Mumbai");
		obj.add(100);
		obj.add('A');
		obj.add("Pune");
		obj.add(null);
		obj.add("Pune");
		obj.add(200);
		obj.add(300);
		obj.add("Kolhapur");
		
		System.out.println(obj);
		obj.clear();
		System.out.println(obj);

		

		/*System.out.println(al);

		System.out.println(al.size()); //it will give the size

		System.out.println(al.isEmpty());

		System.out.println(al.contains("Pune"));

		System.out.println(al.get(1)); //Access Specific element from ArrayLiast

		al.remove(1); //it will remove the data from index 1
		System.out.println(al);

		al.add(2,"Ajinkya"); //insert element in the array list
		System.out.println(al);

		al.set(0, "Kolhapur"); //Modify element in the Array List.
		System.out.println(al);

//ArrayList<Character> obj = new ArrayList<Character>();
//List a = new ArrayList();

//obj.add("Mumbai");
//obj.add(100);
//obj.add('A');
//obj.add("Pune");
//obj.add(null);
//obj.add("Pune");
//obj.add(200);
//obj.add(300);
//obj.add("Kolhapur");


//System.out.println(obj);
/*System.out.println(obj);

ArrayList o = new ArrayList();
o.add("Mumbai");
o.add(100);
o.add('A');

obj.removeAll(o);

System.out.println(obj);

//System.out.println(a);

//System.out.println("Size of an ArrayList: "+a.size());

//System.out.println(a.isEmpty());

//System.out.println(a.get(3));

//System.out.println(a);

//a.remove(1);
//System.out.println(a);

//a.add(2, "Ajinkya");
//System.out.println(a);

//a.set(0, "America");
//System.out.println(a);*/


	}

}

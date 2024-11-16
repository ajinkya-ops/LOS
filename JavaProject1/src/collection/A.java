package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class A {
public static void main(String[] args) {
	ArrayList obj = new ArrayList();
	
	obj.add("Mumbai");
	obj.add(100);
	obj.add('A');
	obj.add("Pune");
	obj.add(null);
	obj.add("Pune");
	obj.add(200);
	obj.add(300);
	obj.add("Kolhapur");
	
	for (Object s: obj)
	{
		System.out.println(s);
	}
	
	/*for(int i = 0; i<obj.size(); i++)
	{
		System.out.println(obj.get(i));
	}
	
	/*System.out.println(obj);
	
	ListIterator itr = obj.listIterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}*/
	
}
}

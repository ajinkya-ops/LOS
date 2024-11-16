package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Sett {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashSet hs = new LinkedHashSet();

hs.add("London");
hs.add(500);
hs.add('A');
hs.add(22.3);

System.out.println(hs);

Iterator itr = hs.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}

System.out.println();

for(Object o:hs)
{
	System.out.println(o);
}
//ArrayList ar = new ArrayList(hs);
//System.out.println(ar);
//System.out.println(ar.get(3));




//hs.remove("London");

//System.out.println(hs);

/*for(Object a:hs)
{
	System.out.println(a);
}*/

//hs.clear();
//System.out.println(hs);
//System.out.println(hs.isEmpty());

//System.out.println(hs.size());

/*Iterator itr = hs.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}*/




	}

}

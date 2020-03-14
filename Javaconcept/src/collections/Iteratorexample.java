package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iteratorexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(2*5);
		List<String> mylist=new ArrayList<String>();
		
		mylist.add("java");
		mylist.add("perl");
		mylist.add("c++");
		mylist.add("c#");
		System.out.println(mylist);
		
		Iterator<String> itr = mylist.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}

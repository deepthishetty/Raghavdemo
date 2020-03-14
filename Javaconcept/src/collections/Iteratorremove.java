package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iteratorremove {

	public static void main(String[] args) {
		List<String> lst=new ArrayList<String>();
		lst.add("chapathi");
		lst.add("ppori");
		lst.add("sagu");
		lst.add("kurma");
		String removeelement="sagu";
	System.out.println(lst);	
	Iterator<String>	itr=lst.iterator();
	
	ListIterator<String> litr = lst.listIterator();
	
	while(litr.hasNext())
	{
		System.out.println(litr.next());
	}
	
	while(litr.hasPrevious())
	{
	System.out.println(litr.previous());	
	}
	
	while(itr.hasNext())
	{
		if(itr.next().equals(removeelement))
		{
			itr.remove();
		}
	}

	System.out.println(lst);
	}

}

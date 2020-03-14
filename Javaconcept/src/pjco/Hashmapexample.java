package pjco;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmapexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,String> hm=new HashMap<Integer,String>();
hm.put(1, "one");
hm.put(2, "two");
hm.put(3, "three");
hm.put(4, "four");
hm.put(5, "five");

Set<Entry<Integer, String>> set = hm.entrySet();

Iterator<Entry<Integer, String>> iterator = set.iterator();
while(iterator.hasNext())
{
Entry<Integer, String> s = iterator.next();
System.out.println("key is:"+s.getKey()+"value is"+s.getValue());
}

for(Entry<Integer,String> entry:set)
{
	System.out.println("key is:"+entry.getKey()+"value is"+entry.getValue());
}
System.out.println(hm);
hm.remove(5);
System.out.println(hm);

HashMap<String,String> hms=new HashMap<String,String>();
hms.put("aavani", "rai");
hms.put("deepthi", "rai");
hms.put("vijaya", "shetty");
hms.put("rahul", "shetty");
hms.put("Sushma", "shetty");
System.out.println(hms.get("aavani"));
System.out.println(hms.get("deepthi"));

	}

}

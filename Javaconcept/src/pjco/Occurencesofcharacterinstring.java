package pjco;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Occurencesofcharacterinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Javaisgoodlanguage";
HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
char[] c=s.toCharArray();
for(Character ch:c)
{
	if(hm.containsKey(ch))
	{
		hm.put(ch, hm.get(ch)+1);
	}
	else
	{
		hm.put(ch, 1);
	}
}

Set<Entry<Character,Integer>> set=hm.entrySet();

for(Entry<Character,Integer> entry:set)
{
	System.out.println("Key is"+entry.getKey()+" value is"+entry.getValue());
}

for(Entry<Character,Integer> entry:set)
{
	if(entry.getValue()>1)
	{
		System.out.println("more than one ocuurences  is "+entry.getKey());
	}
}
	}

}

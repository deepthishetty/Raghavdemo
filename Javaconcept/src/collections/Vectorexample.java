package collections;

import java.util.Enumeration;
import java.util.Vector;

public class Vectorexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Object> vctr=new Vector<Object>();
		vctr.add("hi");
		vctr.add("hello");
		vctr.add(1);
		vctr.add('C');
		System.out.println(vctr);
		Enumeration enm=vctr.elements();
		
		while(enm.hasMoreElements())
		{
			System.out.println(enm.nextElement());
		}
	}

}

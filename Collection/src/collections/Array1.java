package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Array1 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("First");
		list.add("Second");
		list.add( "Third");
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("One");
		list1.add("Two");
		list.addAll( list1);
		Iterator itr1=list.iterator();
		while(itr1.hasNext())
		{
			System.out.print(itr1.next()+" ");
			
		}
	}

}

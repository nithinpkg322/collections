package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Delete_Elements {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayList<String> list=new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.clear();
		Iterator itr1=list.iterator();
		while(itr1.hasNext())
		{
			System.out.print(itr1.next()+" ");
			
		}
		
		
		
		
	}

}

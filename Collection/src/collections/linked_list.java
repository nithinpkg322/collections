package collections;

import java.util.LinkedList;
import java.util.Scanner;

public class linked_list {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    LinkedList<String>list=new LinkedList<String>();
    for(int i=0;i<n;i++)
    {
    	System.out.println("Enter the name");
		String name=s.next();
		System.out.println("Enter the age");
		String age=s.next();
		System.out.println("Enter the contact number");
		String contactnumber=s.next();
		System.out.println("Enter the email id");
		String email=s.next();
		System.out.println("Enter the proof type");
	    String prooftype=s.next();
	    list.add(name);
	    list.add(age);
	    list.add(contactnumber);
	    list.add(email);
	    list.add(prooftype);
	    }
    System.out.println("size of list "+list.size());
    System.out.println("list is "+list.isEmpty());
	}

}

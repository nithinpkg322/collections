package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class casestudy_1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		int n=s.nextInt();
		ArrayList list=new ArrayList();
		customer[] c=new customer[n];
		for(int i=0;i<n;i++) {
		System.out.println("Registration");
		System.out.println("Enter the name");
		String name=s.next();
		System.out.println("Enter the address");
		String address=s.next();
		System.out.println("Enter the contact number");
		int contactnumber=s.nextInt();
		System.out.println("Enter the email id");
		String email=s.next();
		System.out.println("Enter the proof type");
	    String prooftype=s.next();
		System.out.println("Enter the proof id");
		String proofid=s.next();
		c[i]=new customer();
		c[i].setName(name);
		c[i].setAddress(address);
		c[i].setContactNumber(contactnumber);
		c[i].setEmail(email);
		c[i].setProofType(prooftype);
		c[i].setProofID(proofid);
		
		System.out.println("Do you want to update email (y/n)?");
	
			String y1=s.next();
			if(y1.equals("y"))
			{
			System.out.println("update the email ");
			System.out.println("enter new email id ");
			String email1 = s.next();
			c[i].setName(name);
			c[i].setAddress(address);
			c[i].setContactNumber(contactnumber);
			c[i].setEmail(email1);
			c[i].setProofType(prooftype);
			c[i].setProofID(proofid);
			}
			else {
				c[i].setName(name);
				c[i].setAddress(address);
				c[i].setContactNumber(contactnumber);
				c[i].setEmail(email);
				c[i].setProofType(prooftype);
				c[i].setProofID(proofid);
			}
			list.add(c[i]);
		}
		Iterator<customer> itr1=list.iterator();
		while(itr1.hasNext())
		{
			customer e=itr1.next();
			System.out.println(e.getName());
			System.out.println(e.getAddress());
			System.out.println(e.getContactNumber());
			System.out.println(e.getEmail());
			System.out.println(e.getProofType());
			System.out.println(e.getProofID());
			
		}
		int d=0;
		System.out.println("Do ypu want to delete");
		int id=s.nextInt();
		list.remove(id);
		Iterator<customer> itr11=list.iterator();
		int j;
		for(j=0;itr1.hasNext();j++) {
			d=j;
			d++;
			customer e = itr1.next();
			System.out.println("customer" +d);
			System.out.println(e.getName());
			System.out.println(e.getAddress());
			System.out.println(e.getContactNumber());
			System.out.println(e.getEmail());
			System.out.println(e.getProofType());
			System.out.println(e.getProofID());
		}
		
	}

}

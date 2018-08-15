package com.sourceit;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.print("¬ведите строку - ");		
		Object e = sc.next();
		
		MyList mylist;
		mylist = new DefaultMyList();
		
			mylist.add(e);
			System.out.println("Sorted Array - " + Arrays.toString(mylist.toArray()));
			System.out.println("MyList Size - " + mylist.size());
			System.out.println("MyList contains -> " + e + " is " + mylist.contains(e));
			System.out.println(mylist.containsAll(mylist));
		
		sc.close();
	}

}


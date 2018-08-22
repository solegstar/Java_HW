package com.sourceit;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class HomeWork81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите строку - ");
		String e = sc.next();

		MyList mylist;
		mylist = new DefaultMyList();

		mylist.add(e);
		mylist.add("546");
		mylist.add("sdaf");
		mylist.add("nvd");
		mylist.add("459");
		mylist.add("xyz");

		System.out.println("Array - " + Arrays.toString(mylist.toArray()));
		System.out.println("MyList Size - " + mylist.size());
//			System.out.println("MyList Remove  - " + e + " is " + mylist.remove(e));
//			System.out.println("Sorted Array - " + Arrays.toString(mylist.toArray()));
//			System.out.println("MyList Size - " + mylist.size());
		System.out.println("MyList contains -> " + e + " is " + mylist.contains(e));
		System.out.println(mylist.containsAll(mylist));

//			mylist.clear();
//			System.out.println("Cleared Array - " + Arrays.toString(mylist.toArray()));
//			System.out.println("MyList Size - " + mylist.size());			

		MyList con = new DefaultMyList();
		con = mylist;

		// ...
		for (Object o : con) {
			System.out.println("forEach cycle -> " + o);
		}

		Iterator<Object> it = con.iterator();

		while (it.hasNext()) {
			System.out.println("while cycle -> " + it.next());
		}

		it.remove();

		System.out.println("Array - " + Arrays.toString(mylist.toArray()));
		System.out.println("MyList Size - " + mylist.size());

		mylist.clear();
		System.out.println("Cleared Array - " + Arrays.toString(mylist.toArray()));
		System.out.println("MyList Size - " + mylist.size());

		sc.close();
	}

}

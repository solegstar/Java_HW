package com.sourceit;

import java.util.Arrays;

public class DefaultMyList implements MyList{
	String e1 = "abzccxfvdefbgfb";
	
	@Override
	public void add(Object e) {
		// TODO Auto-generated method stub
		System.out.println("Original Obj - " + e1.toString());
		e1 = e1 + e;
		System.out.println("Added Obj - " + e1.toString());
		
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		e1 = "";
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		
		return true;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		Object [] arr = e1.split("");
		return Arrays.stream(arr)
				.sorted()
				.toArray(Object[]::new);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return e1.length();
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return e1.contains((CharSequence) o);
	}

	@Override
	public boolean containsAll(MyList c) {
		// TODO Auto-generated method stub
		return e1.equals(c);
	}

}

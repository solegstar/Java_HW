package com.sourceit;

import java.util.Arrays;

public class DefaultMyList implements MyList{
	private int size = 0;
	private Object [] mylist = new Object [size];
	
	
	@Override
	public void add(Object e) {
		// TODO Auto-generated method stub

		Object [] templist = Arrays.copyOf(mylist, size + 1);
		templist [size] = e;
		mylist = templist;
		size++;
		
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		size = 0;
		mylist = new Object [size];
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		if (mylist.length > 0) {
			Object [] tempList = new Object [(mylist.length - 1)];

			int index = Arrays.binarySearch(mylist, o);
			
			System.out.println("Index - " + index);
			tempList = Arrays.copyOfRange(mylist, 0, (index - 1));
			tempList = Arrays.copyOfRange(mylist, (index + 1), mylist.length);
			mylist = tempList;
		}
		return true;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return Arrays.stream(mylist)
				.sorted()
				.toArray(Object[]::new);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return mylist.length;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		int index = Arrays.binarySearch(mylist, o);
		if (mylist[index] == o) {
			return true;
		} else return false;

	}

	@Override
	public boolean containsAll(MyList c) {
		// TODO Auto-generated method stub
		Object [] tempList = c.toArray();
//		Arrays.deepEquals(tempList, mylist);
		return Arrays.deepEquals(tempList, mylist);
	}

}

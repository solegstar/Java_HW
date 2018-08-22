package com.sourceit;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class DefaultMyList implements MyList {
	private int size = 0;
	int i = 0;
	private Object[] mylist = new Object[size];

	public Iterator<Object> iterator() {
		return new IteratorImpl();
	}

	private class IteratorImpl implements Iterator<Object> {

		private boolean flag;
		private boolean isHasNext;
		private boolean isNext;
		private boolean isRemoved;
		int i = 0;

		public boolean hasNext() { // returns true if the iteration has more elements
			// …
			if (!flag) {
				if (i < size) {
					flag = true;
					isHasNext = true;
				} else
					isHasNext = false;
			}
			return isHasNext;

		}

		public Object next() { // returns the next element in the iteration
			// …
			if (!flag) {
				isHasNext = hasNext();

			}
			if (isHasNext) {
				flag = false;
				isNext = true;
				isRemoved = false;
				i++;
				return mylist[i - 1];
			} else {
				throw new NoSuchElementException();
			}
		}

		public void remove() { // removes from the underlying collection the last element returned by this
								// iterator
			if (!isNext | isRemoved) {
				throw new IllegalStateException();
			} else if (mylist.length > 0) {
				Object[] tempListRem = new Object[(mylist.length - 1)];

//				System.out.println("Iterator pos. - " + i);
				if (i > 0) {
					tempListRem = Arrays.copyOfRange(mylist, 0, (i - 1));
				}

				if (i < mylist.length) {
					tempListRem = Arrays.copyOfRange(mylist, (i + 1), mylist.length);
				}

				mylist = tempListRem;
			}
			isRemoved = true;
			isNext = false;
			i--;
		}
	}

	@Override
	public void add(Object e) {
		// TODO Auto-generated method stub

		Object[] templist = Arrays.copyOf(mylist, size + 1);
		templist[size] = e;
		mylist = templist;
		size++;

	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		size = 0;
		i = 0;
		mylist = new Object[size];
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		if (mylist.length > 0) {
			Object[] tempList = new Object[(mylist.length - 1)];

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
		return Arrays.stream(mylist).toArray(Object[]::new);
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
		} else
			return false;

	}

	@Override
	public boolean containsAll(MyList c) {
		// TODO Auto-generated method stub
		Object[] tempList = c.toArray();
//		Arrays.deepEquals(tempList, mylist);
		return Arrays.deepEquals(tempList, mylist);
	}

}

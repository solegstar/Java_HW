package com.sourceit;

import java.util.concurrent.*;
import java.util.*;

class MaxMatrix implements Callable<Integer> {
	private int id;

	public MaxMatrix(int id) {
		this.id = id;
	}

	public Integer call() {
		int[] array = new int[100];

		for (int i = 0; i < (array.length); i++) {
			array[i] = (int) (Math.random() * 10_000);
		}
		int max = array[0];
		System.out.println();
		for (int i = 0; i < 100; i++) {
			System.out.println("Поток - " + id + "; Ячейка массива [" + i + "] равна - " + array[i]);
			if (max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}
}

public class MaxMatrixCallableDemo {
	public static void main(String[] args) {
		int maxThreads = 4;
		Integer max = 0;
		long mill = System.currentTimeMillis();
		ExecutorService exec = Executors.newFixedThreadPool(maxThreads);
		ArrayList<Future<Integer>> results = new ArrayList<Future<Integer>>();

		for (int i = 0; i < maxThreads; i++)
			results.add(exec.submit(new MaxMatrix(i)));

		for (Future<Integer> maxRes : results)
			try {
				if (max < maxRes.get()) {
					Thread.sleep(1);
					max = maxRes.get();
				}
				System.out.println(maxRes.get() + " max - " + max);
			} catch (InterruptedException e) {
				System.out.println(e);
				return;
			} catch (ExecutionException e) {
				System.out.println(e);
			} finally {
				exec.shutdown();
			}
		long delta = (System.currentTimeMillis() - mill);
		System.out.println(
				Thread.currentThread().getName() + " ended its work; Time in sec. is - " + (double) delta / 1000);
	}
}
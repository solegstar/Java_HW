package com.sourceit;

import java.util.Scanner;

public class HomeWork133 {
	public int[] randomNumbers() {

		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = (int) (Math.random() * 1000);
		}
		return arr;
	}

	public String[] randomStrings() {

		String[] stringArr = new String[10];

		for (int i = 0; i < 10; i++) {
			String string = Character.toString((char) (Math.random() * 26 + 65)) + i;
			stringArr[i] = string;
		}

		return stringArr;
	}

	public static void main(String[] args) throws InterruptedException {

		Part2 concThread = new Part2();
		new Part3();

		concThread.start();

		new Scanner(System.in).nextLine();
		concThread.interrupt();
		Thread.sleep(1000);
		System.out.println(Thread.currentThread().getName() + " ended its work");

	}

}
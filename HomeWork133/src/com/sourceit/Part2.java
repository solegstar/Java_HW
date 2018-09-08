package com.sourceit;

public class Part2 extends Thread {

	HomeWork133 spam = new HomeWork133();

	int[] timeArr = spam.randomNumbers();
	String[] stringArr = spam.randomStrings();

	@Override
	public void run() {
		try {
			int i = 0;

			while (true) {

				Thread.sleep(timeArr[i]);
				System.out.println(this.getName() + " time delays: " + timeArr[i] + " ms; String: " + stringArr[i]);
				i++;
				if (i == 10) {
					i = 0;
				}

			}

		} catch (InterruptedException e) {
			System.out.println(this.getName() + " ended its work");

		}

	}

}


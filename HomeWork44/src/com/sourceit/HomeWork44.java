package com.sourceit;

import java.util.Scanner;

public class HomeWork44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Vvedite stroku - ");		
		String nextString = sc.nextLine();				// chtenie potoka srazu v String

		System.out.println("Kolichestvo slov v stroke - " + returnNum(nextString));
		sc.close();
	}

	private static int returnNum (String nextString) {
		String[] split = nextString.split(" ");		// razlozhenie potoka po slovam
		int i = split.length;
		return i;
	}
}
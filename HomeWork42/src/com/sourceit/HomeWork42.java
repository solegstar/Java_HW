package com.sourceit;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.print("Vvedite razmer massiva - ");		
		int n = sc.nextInt();				// razmer v n 
		
		int[] arr = new int [n];
		
		Random rnd = new Random ();

		System.out.println("\nIshodnyj massiv sluchajnyh chisel:");
		
		for (int i = 0; i < n ; i++) {
				arr[i] = rnd.nextInt(1000);				// zapolnim massiv sluch. chislom 
		}
		
		System.out.println(Arrays.toString(arr) + "\n");
		sc.close();
		
		System.out.println("Maksimal'noe chislo v massive:\n" + returnMax(arr));
	}

// Vyborka maksimal'nogo znachenija iz massiva
	
	private static int returnMax (int[] arr) {
		Integer max = Arrays.stream(arr)	// pomeshhaem massiv na konveer
				.boxed()					// perevodim v Integer kazhdyj jelement na konveere
				.max(Integer::compareTo)	// nahodim maksimal'nyj jelement na konveere
				.orElseThrow(null);			// esli znachenija NET na konveere, to vozvrashhaem null
		return max;
	}

}
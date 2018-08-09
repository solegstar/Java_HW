package com.sourceit;

import java.util.Scanner;

public class HomeWork43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.print("Vvedite shirinu okna - ");		
		int x = sc.nextInt();						// chtenie potoka shiriny okna
		
		System.out.print("Vvedite vysotu okna - ");		
		int y = sc.nextInt();						// chtenie potoka vysoty okna

		doWindow (x, y);

		sc.close();
	}
	
	private static void doWindow (int x, int y) {
		
		for (int i = 0; i < y; i++) {				// kol-vo ciklov vysoty okna
			for (int j = 0; j < x; j++) {			// kol-vo ciklov shiriny okna
				if ((j == 0)|(j == (x - 1))|(i == 0)|(i == (y - 1))) {	
					System.out.print("+");			// pervaja/poslednjaja stroka i pervyj/poslednij simvol
				} else	System.out.print(" ");
			}
			
			System.out.println("");				// perehod na sledujushhuju stroku konsoli
		}
	}
	
}
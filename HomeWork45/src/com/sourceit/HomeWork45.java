//найти слова в которых больше 3 символов
package com.sourceit;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.println("¬ведите строку - ");		
		String nextString = sc.nextLine();				// чтение потока сразу в String
		
		String[] split = nextString.split(" ");			// разложение потока по словам
		
		split = returnWords(split);						// вызов метода сравнени€
		
		System.out.println("Cлова в строке больше 3х символов - " + Arrays.toString(split));
		sc.close();
	}

	private static String[] returnWords (String [] split) {
		String [] moreThan3 = Arrays.stream(split)
				.filter(str -> str.length() > 3)
				.toArray(String[]::new);
		return moreThan3;
	}

}

//����� ����� � ������� ������ 3 ��������
package com.sourceit;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.println("������� ������ - ");		
		String nextString = sc.nextLine();				// ������ ������ ����� � String
		
		String[] split = nextString.split(" ");			// ���������� ������ �� ������
		
		split = returnWords(split);						// ����� ������ ���������
		
		System.out.println("C���� � ������ ������ 3� �������� - " + Arrays.toString(split));
		sc.close();
	}

	private static String[] returnWords (String [] split) {
		String [] moreThan3 = Arrays.stream(split)
				.filter(str -> str.length() > 3)
				.toArray(String[]::new);
		return moreThan3;
	}

}

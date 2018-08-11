package com.sourceit;

import java.util.Arrays;

class CandySimple {
	 int weight;
	 int sugar;

	
	public int getWeight () {
		return weight;
	}

	public int getSugar () {
		return sugar;
	}

	CandySimple (int weight, int sugar) {
		
		this.weight = weight;
		this.sugar = sugar;
	}
}

class CandyChocolate extends CandySimple {

	int chocolate;
	
	public int getChocolate () {
		return chocolate;
	}

	CandyChocolate(int weight, int sugar, int chocolate) {
		super(weight, sugar);

		this.chocolate = chocolate;
	
	}
}


public class HomeWork61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CandyChocolate candy1 = new CandyChocolate (100, 150, 0);
		CandyChocolate candy2 = new CandyChocolate (10, 50, 0);
		CandyChocolate candy3 = new CandyChocolate (150, 15, 0);
		CandyChocolate candy4 = new CandyChocolate (200, 10, 0);
		CandyChocolate candy5 = new CandyChocolate (300, 300, 50);
		CandyChocolate candy6 = new CandyChocolate (35, 80, 150);
		CandyChocolate candy7 = new CandyChocolate (700, 40, 350);
		CandyChocolate candy8 = new CandyChocolate (200, 500, 250);
		
		CandyChocolate [] present = {candy1, candy2, candy3, candy4, candy5, candy6, candy7, candy8};
		

		int totalWeight = 0;
		
		for (int i=0; i < 8; i++) {
			totalWeight += present[i].getWeight(); 
			}
		System.out.println("Present total weight = " + totalWeight);
	
	
		System.out.println("\nSort by - 100 >= Weight <= 500 ");
		for (int i=0; i < 8; i++) {
			if ((present[i].getWeight() >= 100) & (present[i].getWeight() <= 500)) {
				System.out.println ("Weight = " + present[i].getWeight() + ", Sugar = " + present[i].getSugar()
									+ ", Chocolate = " + present[i].getChocolate());
			}
		}

		System.out.println("\nSort by - Sugar ");
	    for (int i = present.length-1 ; i > 0 ; i--){
	        for (int j = 0 ; j < i ; j++){
	            if (present[j].getSugar() > present[j+1].getSugar()){
	                CandyChocolate tmp = present[j];
	                present[j] = present[j+1];
	                present[j+1] = tmp;
	            }
	        }
			System.out.println ("Weight = " + present[i].getWeight() + ", Sugar = " + present[i].getSugar()
					+ ", Chocolate = " + present[i].getChocolate());
	    }
	}

}

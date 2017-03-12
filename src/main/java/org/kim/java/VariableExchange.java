package org.kim.java;

import java.util.Scanner;

/**
*@author create by Kim
*@date Mar 12, 2017
*/

public class VariableExchange {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter value of A");
		long a = scanner.nextLong();
		System.out.println("Please enter value of B");
		long b = scanner.nextLong();
		
		System.out.println("A = " + a + ";\t" + "B = " + b);
		
		System.out.println("Exchange tow values");
		
		a = a^b;
		b = b^a;
		a = a^b;
		System.out.println("A = " + a + ";\t" + "B = " + b);
	}

}

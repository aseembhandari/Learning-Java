package org.java.learning.numbers;
/**
 * This program shows the functionality of a simple calculator
 * */

import java.util.Scanner;

class Calculator {
	private static Scanner aseem;

	public static void main(String args[]) {
		aseem = new Scanner(System.in);
		double fnum, snum, answer; // declaring variables
		System.out.print("Enter First Number: ");
		fnum = aseem.nextDouble(); // enter the first number and store in fnum
		System.out.print("Enter Second Number: ");
		snum = aseem.nextDouble(); // enter the second number and store in snum
		answer = fnum + snum;
		System.out.println(answer);
	}
}

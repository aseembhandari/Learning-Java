package org.java.learning.numbers;
/**
 * This program demonstrates Switch Case in Java 
 * */
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		int floorNumber;
		Scanner floorInput = new Scanner(System.in);
		System.out.print("Enter the floor number from 1-3:: ");
		String input = floorInput.nextLine();
		floorNumber = Integer.parseInt(input);

		switch (floorNumber) {
		case 1:
			System.out.println("Go to Floor 1");
			break;
		case 2:
			System.out.println("Go to Floor 2");
			break;
		case 3:
			System.out.println("Go to Floor 3");
			break;
		default:
			System.out.println("Go to ground floor");
			break;

		}

		

	}
}

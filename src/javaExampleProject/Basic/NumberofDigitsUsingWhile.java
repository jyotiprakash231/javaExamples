package javaExampleProject.Basic;

import java.util.Scanner;

public class NumberofDigitsUsingWhile {
	private static Scanner sc;
	
	public static void main(String[] args) {
		int Number, Count=0;
		sc = new Scanner(System.in);		
		System.out.println("\n Please Enter any Number: ");
		Number = sc.nextInt();
		
		while(Number > 0) {
			Number = Number / 10;
			Count = Count + 1;
		}
		System.out.format("\n Number of Digits in a Given Number = %d", Count);
	}
}

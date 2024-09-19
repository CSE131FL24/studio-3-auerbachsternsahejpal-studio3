package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the highest number: ");
		int highestNumber = in.nextInt();
		boolean[] sieve = new boolean[highestNumber + 1];
		for(int i = 2; i < sieve.length; i++ ) {
			for(int j = 2*i; j < sieve.length; j+=i ) {
				int k = sieve.indexOf(j);
			}
		}
		
		

	}

}

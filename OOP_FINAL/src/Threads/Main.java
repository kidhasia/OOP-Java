package Threads;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Object lock = new Object();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Pattern 01: ");
		String pattern01 = scanner.next();

		System.out.print("Enter Pattern 02: ");
		String pattern02 = scanner.next();
		
		System.out.print("Enter count: ");
		int count = scanner.nextInt();
		
		Thread Pattern_01 = new Pattern01(lock,pattern01,count);
		Thread Pattern_02 = new Pattern02(lock,pattern02,count);
		
		Pattern_01.start();
		Pattern_02.start();
		
		
		try {
			Pattern_01.join();
			Pattern_02.join();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}


}

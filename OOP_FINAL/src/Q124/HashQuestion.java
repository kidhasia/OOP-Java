package Q124;

import java.util.HashMap;
import java.util.Scanner;

public class HashQuestion extends Thread {
	public static void main(String[] args) {
		
		HashMap<Integer, String> productMap = new HashMap();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("Enter product ID(Enter -99 to exit): ");
			int productID = scanner.nextInt();
			
			if(productID== -99) {
				break;
			}
			
				System.out.print("Enter product name: ");
				String productName = scanner.next();
				System.out.println();
	
			productMap.put(productID, productName);
		}
		
		System.out.println(productMap);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.print("Enter 1 to remove items: ");
		int removeItems = scanner.nextInt();
		
		if(removeItems==1) {
			
			System.out.print("Enter item ID to remove: ");
			int removeID = scanner.nextInt();
			if(productMap.containsKey(removeID)) {
				productMap.remove(removeID);
				
			}
			
			for(Integer id : productMap.keySet()) {
				System.out.print(id+" "+productMap.get(id));
				System.out.println();
			}
		}
		
		
	}

}

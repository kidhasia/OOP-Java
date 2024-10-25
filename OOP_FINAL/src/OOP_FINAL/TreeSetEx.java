package OOP_FINAL;

import java.util.TreeSet;

public class TreeSetEx {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> treeTest = new TreeSet();
		
		for(int i =0; i<10; i++) {
			treeTest.add(i);
		}
		 for(int ts : treeTest) {
			System.out.println(ts);
			 
		 }
		
	}

}

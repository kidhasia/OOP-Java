package OOP_FINAL;

import java.util.HashSet;

public class HashSetEx { 
    public static void main(String[] args) {
		
    	HashSet<String> userReg = new HashSet();
    	
    	userReg.add("Gaveen");
    	userReg.add("Layara");
    	userReg.add("Anjana");
    	userReg.add("Jayavi");
    	
    	int alSize = userReg.size();
    	
    	System.out.println(alSize);
    	
	}
}

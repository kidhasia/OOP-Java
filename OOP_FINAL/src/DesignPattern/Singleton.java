
/*
 * To make a Singleton design patter class here are the steps to follow
 * First make a u have to understand the class diagram of the singleton class
 * 
 * 01:- Create a private static instance
 * 02:- Create a private constructor to prevent instantiation 
 * 03:- Create a method to get a single instance 
 * 04:- Method to simulate 
 * 
 * 
 * */
package DesignPattern;

public class Singleton{
	
	//Creating a private instance of Singleton class
	private static Singleton instance;
	
	//Creating a private constructor 
	private Singleton() {
			  	
	}
	
	//Creating a singleton method
	public static Singleton getInstanceMethod() {
		if(instance == null) {
			instance = new Singleton();
		}
		
		return instance;
		
	}
	
	public static void connectEstb()	{
		System.out.println("Connection is estabilished!");
	}
	
	
	
}

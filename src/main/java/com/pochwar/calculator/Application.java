/**
 * 
 */
package com.pochwar.calculator;

/**
 * @author poch
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 1;
		
		Addition add = new Addition(a);
		
		add.make(5);		
		System.out.println(add.getValue());
		
		add.make(8);		
		System.out.println(add.getValue());

	}

}

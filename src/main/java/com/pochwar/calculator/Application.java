/**
 * @author poch
 *
 */
package com.pochwar.calculator;

public class Application {

	/**
	 * @param args
	 */
	public static void main() {
		int myNumber = 1;
		
		Addition add = new Addition(myNumber);
		
		add.make(5);		
		System.out.println(add.getValue());
		
		add.make(8);		
		System.out.println(add.getValue());
	}

}

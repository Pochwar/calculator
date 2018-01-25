/**
 * @author poch
 *
 */

package com.pochwar.calculator;

import java.util.logging.Logger;

public class Application {

	/**
	 * @param args
	 */
	public static void main() {
		final int myNumber = 1;
		
		final Addition add = new Addition(myNumber);
		
		add.make(5);
		Logger.getLogger(String.valueOf(add.getValue()));
		
		
		add.make(8);		
		Logger.getLogger(String.valueOf(add.getValue()));
	}

}

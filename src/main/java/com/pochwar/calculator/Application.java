/**
 * @author poch
 *
 */

package com.pochwar.calculator;

import java.util.logging.Logger;

public final class Application {
	
	private Application() {}

	/**
	 * main method of the application
	 */
	public static void main() {
		

		final Addition add = new Addition(1);
		
		add.make(5);
		Logger.getLogger(String.valueOf(add.getValue()));
		
		
		add.make(8);		
		Logger.getLogger(String.valueOf(add.getValue()));
	}

}

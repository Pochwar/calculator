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
		
		
		final Addition add = new Addition(1);
		
		add.make(5);
		Logger.getLogger(String.valueOf(add.getValue()));
		
		
		add.make(8);		
		Logger.getLogger(String.valueOf(add.getValue()));
	}

}

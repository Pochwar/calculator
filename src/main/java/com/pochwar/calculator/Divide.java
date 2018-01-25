/**
 * @author poch
 *
 */
package com.pochwar.calculator;

public class Divide {
	/**
	 * Value on which we will make divide
	 */
	protected transient int value;
	
	/**
	 *  Class constructor to set value
	 * @param valueToSet
	 */
	public Divide(final int valueToSet) {
		this.value = valueToSet;
	}
	
	/**
	 * Method to make the divide
	 * @param divider
	 */
	public void make(final int divider) {
		if(divider == 0) {
			this.value = Integer.MIN_VALUE;
		} else {
			this.value = this.value / divider;
		}
		
	}
	
	/**
	 * Metho to get the current value
	 * @return
	 */
	public int getValue() {
		return this.value;
	}

}

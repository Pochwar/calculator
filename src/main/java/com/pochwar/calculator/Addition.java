/**
 * @author poch
 *
 */
package com.pochwar.calculator;

public class Addition {
	
	/**
	 * Value on which we will make addition
	 */
	protected transient int value;
	
	/**
	 * Class constructor to set value
	 * @param valueToSet
	 */
	public Addition (final int valueToSet) {
		this.value = valueToSet;
	}
	
	/**
	 * Method to make the addition
	 * @param valueToAdd
	 */
	public void make(final int valueToAdd) {		
		this.value += valueToAdd;
	}
	
	/**
	 * Metho to get the current value
	 * @return
	 */
	public int getValue() {
		return this.value;
	}

}

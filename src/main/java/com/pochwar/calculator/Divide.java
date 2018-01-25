/**
 * @author poch
 *
 */
package com.pochwar.calculator;

public class Divide {

	/**
	 * initial value
	 */
	protected transient int value;
	
	/**
	 * @param valueToSet value to set
	 */
	public Divide(final int valueToSet) {
		this.value = valueToSet;
	}
	
	/**
	 * @param divider divider
	 */
	public void make(final int divider) {
		if(divider == 0) {
			this.value = Integer.MIN_VALUE;
		} else {
			this.value = this.value / divider;
		}
		
	}
	
	/**
	 * @return current value
	 */
	public int getValue() {
		return this.value;
	}

}

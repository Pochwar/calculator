/**
 * 
 */
package com.pochwar.calculator;

/**
 * @author poch
 *
 */
public class Addition {
	
	protected int value = 0;
	
	public Addition (int i) {
		this.value = i;
	}
	
	public void make(int b) {		
		this.value += b;
	}
	
	public int getValue() {
		return this.value;
	}

}

/**
 * @author poch
 *
 */
package com.pochwar.calculator;

/**
 * Class to make additions.
 */
public class Addition {

    /**
     * initial value.
     */
    protected transient int value;

    /**
     * @param valueToSet value to set
     */
    public Addition (final int valueToSet) {
        this.value = valueToSet;
    }

    /**
     * @param valueToAdd value to add
     */
    public void make(final int valueToAdd) {
        this.value += valueToAdd;
    }

    /**
     * @return current value
     */
    public int getValue() {
        return this.value;
    }

}

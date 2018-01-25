/**
 * @author poch
 *
 */

package com.pochwar.calculator;

import java.util.logging.Logger;

/**
 * This is my application.
 */
public final class Application {

    /**
     * Constructor of the application.
     */
    private Application() {}

    /**
     * main method of the application.
     */
    public static void main() {

        final Addition add = new Addition(1);

        add.make(5);
        Logger.getLogger(String.valueOf(add.getValue()));

        add.make(8);
        Logger.getLogger(String.valueOf(add.getValue()));
    }
}

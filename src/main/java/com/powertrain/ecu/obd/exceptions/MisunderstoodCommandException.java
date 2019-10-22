
package com.powertrain.ecu.obd.exceptions;

import com.powertrain.ecu.obd.exceptions.ResponseException;

/**
 * Thrown when there is a "?" message.
 *
 */
public class MisunderstoodCommandException extends ResponseException {

    /**
     * <p>Constructor for MisunderstoodCommandException.</p>
     */
    public MisunderstoodCommandException() {
        super("?");
    }

}

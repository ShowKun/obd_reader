
package com.powertrain.ecu.obd.exceptions;

/**
 * Thrown when there is a "UNABLE TO CONNECT" message.
 *
 */
public class UnableToConnectException extends ResponseException {

    /**
     * <p>Constructor for UnableToConnectException.</p>
     */
    public UnableToConnectException() {
        super("UNABLE TO CONNECT");
    }

}

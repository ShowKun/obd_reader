
package com.powertrain.ecu.obd.exceptions;

/**
 * Thrown when there is "ERROR" in the response
 *
 */
public class UnknownErrorException extends ResponseException {

    /**
     * <p>Constructor for UnknownErrorException.</p>
     */
    public UnknownErrorException() {
        super("ERROR");
    }

}

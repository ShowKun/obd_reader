
package com.powertrain.ecu.obd.exceptions;

import com.powertrain.ecu.obd.exceptions.ResponseException;

/**
 * Thrown when there is a "BUS INIT... ERROR" message
 *
 */
public class BusInitException extends ResponseException {

    /**
     * <p>Constructor for BusInitException.</p>
     */
    public BusInitException() {
        super("BUS INIT... ERROR");
    }

}

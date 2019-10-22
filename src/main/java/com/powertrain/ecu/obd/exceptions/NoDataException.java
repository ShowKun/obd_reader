
package com.powertrain.ecu.obd.exceptions;

import com.powertrain.ecu.obd.exceptions.ResponseException;

/**
 * Thrown when there is a "NO DATA" message.
 *
 */
public class NoDataException extends ResponseException {

    /**
     * <p>Constructor for NoDataException.</p>
     */
    public NoDataException() {
        super("NO DATA");
    }

}

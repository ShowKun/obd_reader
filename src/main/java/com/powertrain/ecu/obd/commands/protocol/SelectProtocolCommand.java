
package com.powertrain.ecu.obd.commands.protocol;

import com.powertrain.ecu.obd.enums.ObdProtocols;

/**
 * Select the protocol to use.
 *
 */
public class SelectProtocolCommand extends ObdProtocolCommand {

    private final ObdProtocols protocol;

    /**
     * <p>Constructor for SelectProtocolCommand.</p>
     *
     * @param protocol a {@link com.github.pires.obd.enums.ObdProtocols} object.
     */
    public SelectProtocolCommand(final ObdProtocols protocol) {
        super("AT SP " + protocol.getValue());
        this.protocol = protocol;
    }

    /** {@inheritDoc} */
    @Override
    public String getFormattedResult() {
        return getResult();
    }

    /** {@inheritDoc} */
    @Override
    public String getName() {
        return "Select Protocol " + protocol.name();
    }

}

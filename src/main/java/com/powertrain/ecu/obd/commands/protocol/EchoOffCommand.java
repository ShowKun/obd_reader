
package com.powertrain.ecu.obd.commands.protocol;

import com.powertrain.ecu.obd.commands.protocol.ObdProtocolCommand;

/**
 * Turn-off echo.
 *
 */
public class EchoOffCommand extends ObdProtocolCommand {

    /**
     * <p>Constructor for EchoOffCommand.</p>
     */
    public EchoOffCommand() {
        super("AT E0");
    }

    /**
     * <p>Constructor for EchoOffCommand.</p>
     *
     * @param other a {@link com.github.pires.obd.commands.protocol.EchoOffCommand} object.
     */
    public EchoOffCommand(EchoOffCommand other) {
        super(other);
    }

    /** {@inheritDoc} */
    @Override
    public String getFormattedResult() {
        return getResult();
    }

    /** {@inheritDoc} */
    @Override
    public String getName() {
        return "Echo Off";
    }

}

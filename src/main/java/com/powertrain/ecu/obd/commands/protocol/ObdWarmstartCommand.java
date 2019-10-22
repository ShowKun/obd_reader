
package com.powertrain.ecu.obd.commands.protocol;

/**
 * Warm-start the OBD connection.
 *
 */
public class ObdWarmstartCommand extends ObdProtocolCommand {

    /**
     * <p>Constructor for ObdWarmstartCommand.</p>
     */
    public ObdWarmstartCommand() {
        super("AT WS");
    }

    /**
     * <p>Constructor for ObdWarmstartCommand.</p>
     *
     * @param other a {@link com.github.pires.obd.commands.protocol.ObdWarmstartCommand} object.
     */
    public ObdWarmstartCommand(ObdWarmstartCommand other) {
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
        return "Warmstart OBD";
    }

}


package com.powertrain.ecu.obd.commands.protocol;

import com.powertrain.ecu.obd.commands.protocol.ObdProtocolCommand;

/**
 * Turns off line-feed.
 *
 */
public class LineFeedOffCommand extends ObdProtocolCommand {

    /**
     * <p>Constructor for LineFeedOffCommand.</p>
     */
    public LineFeedOffCommand() {
        super("AT L0");
    }

    /**
     * <p>Constructor for LineFeedOffCommand.</p>
     *
     * @param other a {@link com.github.pires.obd.commands.protocol.LineFeedOffCommand} object.
     */
    public LineFeedOffCommand(LineFeedOffCommand other) {
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
        return "Line Feed Off";
    }

}

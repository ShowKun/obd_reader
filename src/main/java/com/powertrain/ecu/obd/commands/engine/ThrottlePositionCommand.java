
package com.powertrain.ecu.obd.commands.engine;

import com.powertrain.ecu.obd.commands.PercentageObdCommand;
import com.powertrain.ecu.obd.enums.AvailableCommandNames;

/**
 * Read the throttle position in percentage.
 *
 */
public class ThrottlePositionCommand extends PercentageObdCommand {

    /**
     * Default ctor.
     */
    public ThrottlePositionCommand() {
        super("01 11");
    }

    /**
     * Copy ctor.
     *
     * @param other a {@link com.github.pires.obd.commands.engine.ThrottlePositionCommand} object.
     */
    public ThrottlePositionCommand(ThrottlePositionCommand other) {
        super(other);
    }

    /** {@inheritDoc} */
    @Override
    public String getName() {
        return AvailableCommandNames.THROTTLE_POS.getValue();
    }

}

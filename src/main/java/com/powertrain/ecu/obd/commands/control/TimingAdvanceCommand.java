
package com.powertrain.ecu.obd.commands.control;

import com.powertrain.ecu.obd.commands.PercentageObdCommand;
import com.powertrain.ecu.obd.enums.AvailableCommandNames;

/**
 * Timing Advance
 *
 */
public class TimingAdvanceCommand extends PercentageObdCommand {

    /**
     * <p>Constructor for TimingAdvanceCommand.</p>
     */
    public TimingAdvanceCommand() {
        super("01 0E");
    }

    public TimingAdvanceCommand(TimingAdvanceCommand other) {
        super(other);
    }

    /** {@inheritDoc} */
    @Override
    public String getName() {
        return AvailableCommandNames.TIMING_ADVANCE.getValue();
    }

}

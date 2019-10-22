
package com.powertrain.ecu.obd.commands.engine;

import com.powertrain.ecu.obd.commands.temperature.TemperatureCommand;
import com.powertrain.ecu.obd.enums.AvailableCommandNames;

/**
 * Displays the current engine Oil temperature.
 *
 */
public class OilTempCommand extends TemperatureCommand {

    /**
     * Default ctor.
     */
    public OilTempCommand() {
        super("01 5C");
    }

    /**
     * Copy ctor.
     *
     * @param other a {@link com.github.pires.obd.commands.engine.OilTempCommand} object.
     */
    public OilTempCommand(OilTempCommand other) {
        super(other);
    }

    /** {@inheritDoc} */
    @Override
    public String getName() {
        return AvailableCommandNames.ENGINE_OIL_TEMP.getValue();
    }

}
